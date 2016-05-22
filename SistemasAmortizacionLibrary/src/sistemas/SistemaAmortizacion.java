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
public interface SistemaAmortizacion {
    void generarTabla(DatosDTO datosp);
    double calcularIntereses(double saldo, double tasa);
}
