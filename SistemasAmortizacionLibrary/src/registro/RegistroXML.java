/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import datos.DatosDTO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author Jose Aguilar Quesada
 */
public class RegistroXML implements Registro{
    
    private String rutaArchivo = "";
    public RegistroXML(String prutaArchivo) {
        rutaArchivo = prutaArchivo;
    }

    @Override
    public void agregarEntrada(DatosDTO datosp) {
        Serializer serializer = new Persister();
        Writer writer = null;
        try {
            writer = new FileWriter(rutaArchivo,true);
            System.out.println("Archivo instanciado");
        } catch (IOException ex) {
            Logger.getLogger(RegistroXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            serializer.write(datosp, writer);
            System.out.println("Datos Creados");
        } catch (Exception ex) {
            Logger.getLogger(RegistroXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
