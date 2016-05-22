/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Jose Aguilar Quesada
 */
public class Periodo {
    private int periodo;
    private double saldo;
    private double intereses;
    private double amortizacion;
    private double cuota;

    Periodo(int periodop,double saldop, double interesesp, double amortizacionp, double cuotap){
        periodo = periodop;
        saldo = saldop;
        intereses = interesesp;
        amortizacion = amortizacionp;
        cuota = cuotap;
    };
    /**
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the intereses
     */
    public double getIntereses() {
        return intereses;
    }

    /**
     * @param intereses the intereses to set
     */
    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    /**
     * @return the amortizacion
     */
    public double getAmortizacion() {
        return amortizacion;
    }

    /**
     * @param amortizacion the amortizacion to set
     */
    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }

    /**
     * @return the cuota
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * @param cuota the cuota to set
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
    
    
}
