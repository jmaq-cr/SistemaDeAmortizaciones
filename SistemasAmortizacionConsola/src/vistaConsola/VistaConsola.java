/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaConsola;

import control.Controlador;
import datos.DatosDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jose Aguilar Quesada
 */
public class VistaConsola {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        System.out.println("╔══════════════════╗\n║  CÁLCULO DE AMORTIZACIONES ║\n╚══════════════════╝");
        Controlador principal = new Controlador();
        BufferedReader bufferRead;
        ValidacionesConsola validaciones = new ValidacionesConsola();
        DatosDTO datos  = new DatosDTO();
        String nombreCliente;
        double deudaInicial;
        int plazo;
        double interesAnual;
        String sistemaAmortizacion;
        String moneda;
        //Entrada y validacion del nombre
        System.out.println("Ingrese el nombre del cliente: ");
        bufferRead = new BufferedReader(new InputStreamReader(System.in));
        nombreCliente = bufferRead.readLine();
        //Entrada y validacion de la deuda inicial
        deudaInicial = validaciones.validarDeuda();
        //Entrada y validacion del plazo
        plazo = validaciones.validarPlazo();
        //Entrada y validacion de los intereses
        interesAnual = validaciones.validarIntereses();
        //Entrada y validacion del sistema de amortización
        sistemaAmortizacion = validaciones.validarSistema();
        //Entrada y validacion de la moneda
        moneda = validaciones.validarMoneda();
        datos.setDeudaInicial(deudaInicial);
        datos.setInteresAnual(interesAnual);
        datos.setMoneda(moneda);
        datos.setNombreCliente(nombreCliente);
        datos.setPlazo(plazo);
        datos.setSistemaAmortizacion(sistemaAmortizacion);
        principal.consultarAmortizacion(datos);
                  
    }
}
    
