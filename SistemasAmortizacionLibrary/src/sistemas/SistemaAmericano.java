/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import datos.DatosDTO;

/**
 *
 * @author Jose Aguilar Quesada
 */
public class SistemaAmericano implements SistemaAmortizacion{

    @Override
    public void generarTabla(DatosDTO datosp) {
        double saldo = datosp.getDeudaInicial();
        double intereses = calcularIntereses(saldo,datosp.getInteresAnual());
        double totalIntereses = 0;
        double totalCuotas  = 0; 
        for (int i = 1 ; i <= datosp.getPlazo() ; i++){
            double amortizacion = calcularAmortizacion(saldo,i,datosp.getPlazo());
            double cuota = calcularCuota(intereses,amortizacion);
            datosp.tabla.agregarPeriodo(i, saldo, intereses, amortizacion, cuota);
            totalIntereses += intereses;
            totalCuotas += cuota;
            saldo = (saldo - amortizacion); 
        }
        datosp.tabla.setTotalAmortizacion(datosp.getDeudaInicial());
        datosp.tabla.setTotalCuotas(totalCuotas);
        datosp.tabla.setTotalIntereses(totalIntereses);
    }

    @Override
    public double calcularIntereses(double saldo, double tasa) {
        return (saldo*(tasa/100));
    }
    
    private double calcularAmortizacion(double deudaInicial, int periodo , int plazo) {
        if (periodo == plazo){
            return deudaInicial;
        }
        else{
            return 0;
        }
    }

    private double calcularCuota(double intereses, double amortizacion){
      return (intereses + amortizacion);
    }
}
