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
public class SistemaFrances implements SistemaAmortizacion {
    SistemaFrances(){}

    @Override
    public void generarTabla(DatosDTO datosp) {
        double cuota = calcularCuota(datosp.getDeudaInicial(),datosp.getInteresAnual(),datosp.getPlazo());
        double saldo = datosp.getDeudaInicial();
        double totalIntereses = 0;
        double totalCuotas  = 0; 
        for(int i = 1;i <= datosp.getPlazo(); i++){
            double intereses = calcularIntereses(saldo,datosp.getInteresAnual());
            double amortizacion = calcularAmortizacion(cuota,intereses);
            datosp.tabla.agregarPeriodo(i, saldo, intereses, amortizacion, cuota);
            saldo = (saldo - amortizacion);
            totalIntereses += intereses;
            totalCuotas += cuota;
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

    private double calcularAmortizacion(double cuota, double intereses) {
        return (cuota - intereses);
    }

    private double calcularCuota(double deudaInicial, double tasa, double plazo){
        double imp = tasa/100;
        //Formula para calcular el valor de una cuota en el sistema francés
        double res = (deudaInicial*(imp))/(1-(Math.pow((1+(imp)),-plazo)));
        return res;
    }
    
    
}
