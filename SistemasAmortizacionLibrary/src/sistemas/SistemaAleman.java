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
public class SistemaAleman implements SistemaAmortizacion{

    @Override
    public void generarTabla(DatosDTO datosp) {
        double amortizacion = calcularAmortizacion(datosp.getDeudaInicial(),datosp.getPlazo());
        double saldo = datosp.getDeudaInicial();
        double totalIntereses = 0;
        double totalCuotas  = 0; 
        for(int i = 1 ; i <= datosp.getPlazo() ; i++){
            double intereses = calcularIntereses(saldo,datosp.getInteresAnual());
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
        double res = saldo*(tasa/100);
        return res;
    }
    
    private double calcularAmortizacion(double deudaInicial, int plazo) {
        return (deudaInicial/plazo);
    }

    private double calcularCuota(double intereses, double amortizacion){
        return (intereses + amortizacion);
    }
    
}
