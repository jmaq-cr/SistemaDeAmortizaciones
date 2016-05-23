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
public class DatosDTO {
    private String nombreCliente;
    private double deudaInicial;
    private int plazo;
    private double interesAnual;
    private String sistemaAmortizacion;
    private String moneda;
    private String tiempoChucky;
    private double tipoCambio;
    public TablaAmortizacion tabla;

    public String imprimir(){
        String res = "Nombre del Cliente: "+nombreCliente+"\nMonto Solicitado: "+Double.toString(deudaInicial)+"\nPlazo: "+Integer.toString(plazo)+" años\nTasa Anual: "+Double.toString(interesAnual)+" %\nSistema de Amortización: "+sistemaAmortizacion+"\nMoneda: "+moneda+"\n";
        res += tabla.imprimir();
        return res;
    }
    public DatosDTO(){
        tabla = new TablaAmortizacion();
    }
    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the deudaInicial
     */
    public double getDeudaInicial() {
        return deudaInicial;
    }

    /**
     * @param deudaInicial the deudaInicial to set
     */
    public void setDeudaInicial(double deudaInicial) {
        this.deudaInicial = deudaInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    /**
     * @return the interesAnual
     */
    public double getInteresAnual() {
        return interesAnual;
    }

    /**
     * @param interesAnual the interesAnual to set
     */
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    /**
     * @return the sistemaAmortizacion
     */
    public String getSistemaAmortizacion() {
        return sistemaAmortizacion;
    }

    /**
     * @param sistemaAmortizacion the sistemaAmortizacion to set
     */
    public void setSistemaAmortizacion(String sistemaAmortizacion) {
        this.sistemaAmortizacion = sistemaAmortizacion;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the tiempoChucky
     */
    public String getTiempoChucky() {
        return tiempoChucky;
    }

    /**
     * @param tiempoChucky the tiempoChucky to set
     */
    public void setTiempoChucky(String tiempoChucky) {
        this.tiempoChucky = tiempoChucky;
    }

    /**
     * @return the tipoCambio
     */
    public double getTipoCambio() {
        return tipoCambio;
    }

    /**
     * @param tipoCambio the tipoCambio to set
     */
    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
    
    
}
