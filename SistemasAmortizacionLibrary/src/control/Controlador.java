/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import datos.DatosDTO;
import registro.Registro;
import registro.RegistroXML;
import sistemas.CreadorSistemas;
import sistemas.CreadorSistemasAmortizacion;
import sistemas.SistemaAmortizacion;

/**
 *
 * @author Jose Aguilar Quesada
 */
public class Controlador {
    private SistemaAmortizacion sistema;
    private final CreadorSistemas creador;
    private DatosDTO datos;
    private final Registro registroXML; 
    
    public Controlador(){
        creador = new CreadorSistemasAmortizacion();
        registroXML = new RegistroXML("registro.xml");
    }
    
    public void consultarAmortizacion(DatosDTO pdatos){
        datos =  pdatos;
        sistema = creador.crearSistema(datos.getSistemaAmortizacion());
        sistema.generarTabla(datos);
        registroXML.agregarEntrada(datos);
        datos.imprimir();
    }
}
