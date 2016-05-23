/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasamortizacionvistaconsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jose Aguilar Quesada
 */
public class ValidacionesConsola {
    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    
    public ValidacionesConsola(){
        
    }
    
    public double validarDeuda(){
        double deudaInicial = 0;
        boolean valDeuda = false;
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
        return deudaInicial;
    }
    
    public int validarPlazo(){
        boolean valPlazo = false;
        int plazo = 0;
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
        return plazo;
    }
    
    public double validarIntereses(){
        boolean valInteres = false;
        double interesAnual = 0;
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
        return interesAnual;
    }
    
    public String validarSistema(){
        boolean valSistema = false;
        String sistemaAmortizacion = "";
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
        return sistemaAmortizacion;
    }
    
    public String validarMoneda(){
        boolean valMoneda = false;
        String moneda = "";
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
        return moneda;
    }
}
