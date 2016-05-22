/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Jose Aguilar Quesada
 */
public class TablaAmortizacion {
    private double totalIntereses;
    private double totalAmortizacion;
    private double totalCuotas;
    private ArrayList<Periodo> periodos;
    
    void imprimir(){
        System.out.println("Periodo    Deuda Inicial    Intereses    Amortización    Cuota");
        for(Periodo periodo : periodos){
            System.out.println(periodo.getPeriodo()+"          "+periodo.getSaldo()+"       "+periodo.getIntereses()+"       "+periodo.getAmortizacion()+"        "+periodo.getCuota());
        }
        System.out.println("                            "+totalIntereses+"          "+totalAmortizacion+"          "+totalCuotas);
    }
    
    TablaAmortizacion(){
        this.periodos = new ArrayList<>();
    }

    public void agregarPeriodo(int periodop, double saldop, double interesesp, double amortizacionp, double cuotap){
        periodos.add(new Periodo(periodop,saldop,interesesp,amortizacionp,cuotap));
    }
    /**
     * @return the totalIntereses
     */
    public double getTotalIntereses() {
        return totalIntereses;
    }

    /**
     * @param totalIntereses the totalIntereses to set
     */
    public void setTotalIntereses(double totalIntereses) {
        this.totalIntereses = totalIntereses;
    }

    /**
     * @return the totalAmortizacion
     */
    public double getTotalAmortizacion() {
        return totalAmortizacion;
    }

    /**
     * @param totalAmortizacion the totalAmortizacion to set
     */
    public void setTotalAmortizacion(double totalAmortizacion) {
        this.totalAmortizacion = totalAmortizacion;
    }

    /**
     * @return the totalCuotas
     */
    public double getTotalCuotas() {
        return totalCuotas;
    }

    /**
     * @param totalCuotas the totalCuotas to set
     */
    public void setTotalCuotas(double totalCuotas) {
        this.totalCuotas = totalCuotas;
    }
}
