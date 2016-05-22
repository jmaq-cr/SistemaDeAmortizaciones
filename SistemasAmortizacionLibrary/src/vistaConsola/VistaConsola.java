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
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        DatosDTO datos  = new DatosDTO();
        String nombreCliente;
        double deudaInicial = 0;
        int plazo = 0;
        double interesAnual = 0;
        String sistemaAmortizacion = "";
        String moneda = "";
        
        boolean valDeuda = false;
        boolean valPlazo = false;
        boolean valInteres = false;
        boolean valSistema = false;
        boolean valMoneda = false;
 
        //Entrada y validacion del nombre
        System.out.println("Ingrese el nombre del cliente: ");
	nombreCliente = bufferRead.readLine();
        
        //Entrada y validacion de la deuda inicial
        while(valDeuda == false){
           try
            {
                System.out.println("Ingrese el monto del préstamo: ");
                bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String in = bufferRead.readLine();
                deudaInicial = Double.parseDouble(in);
                valDeuda = true;
            }
            catch(IOException | NumberFormatException e)
            {
                System.out.println("El dato no es correcto. Vuelva a ingresarlo.");
            } 
        }
        
        //Entrada y validacion del plazo
        while(valPlazo == false){
           try
            {
                System.out.println("Ingrese plazo del préstamo (en años): ");
                bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String in = bufferRead.readLine();
                plazo = Integer.parseInt(in);
                valPlazo = true;
            }
            catch(IOException | NumberFormatException e)
            {
                System.out.println("El dato no es correcto. Vuelva a ingresarlo.");
            } 
        }
        
        while(valInteres == false){
           try
            {
                System.out.println("Ingrese la tasa de interés anual: ");
                bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String in = bufferRead.readLine();
                interesAnual = Double.parseDouble(in);
                valInteres = true;
            }
            catch(IOException | NumberFormatException e)
            {
                System.out.println("El dato no es correcto. Vuelva a ingresarlo.");
            } 
        }
        
        //Entrada y validacion del sistema de amortización
        while(valSistema == false){
           try
            {
                System.out.println("Escoja el tipo sistema de amortizaxión: \n1) Francés \n2) Alemán \n3) Americano");
                bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String in = bufferRead.readLine();
               switch (in) {
                   case "1":
                       sistemaAmortizacion = "Francés";
                       valSistema = true;
                       break;
                   case "2":
                       sistemaAmortizacion = "Alemán";
                       valSistema = true;
                       break;
                   case "3":
                       sistemaAmortizacion = "Americano";
                       valSistema = true;
                       break;
                   default:
                       System.out.println("El dato no es correcto. Ingrese una de las opciones.");
                       break;
               }
            }
            catch(Exception e)
            {
                System.out.println("El dato no es correcto. Vuelva a ingresarlo.");
            } 
        }
        
        //Entrada y validacion de la moneda
        while(valMoneda == false){
           try
            {
                System.out.println("Escoja el tipo sistema de amortización: \n1) Colones \n2) Dólares");
                bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String in = bufferRead.readLine();
               switch (in) {
                   case "1":
                       moneda = "Colones";
                       valMoneda = true;
                       break;
                   case "2":
                       moneda = "Dólares";
                       valMoneda = true;
                       break;
                   default:
                       System.out.println("El dato no es correcto. Ingrese una de las opciones.");
                       break;
               }
            }
            catch(Exception e)
            {
                System.out.println("El dato no es correcto. Vuelva a ingresarlo.");
            } 
        }
        
        datos.setDeudaInicial(deudaInicial);
        datos.setInteresAnual(interesAnual);
        datos.setMoneda(moneda);
        datos.setNombreCliente(nombreCliente);
        datos.setPlazo(plazo);
        datos.setSistemaAmortizacion(sistemaAmortizacion);
        
        principal.consultarAmortizacion(datos);
               
	}
    }
    
