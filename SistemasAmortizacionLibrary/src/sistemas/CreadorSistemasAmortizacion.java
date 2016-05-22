/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

/**
 *
 * @author Jose Aguilar Quesada
 */
public class CreadorSistemasAmortizacion implements CreadorSistemas {

    @Override
    public SistemaAmortizacion crearSistema(String tipo) {
        switch (tipo) {
            case "Francés":
                return new SistemaFrances();
            case "Alemán":
                return new SistemaAleman();
            default:
                return new SistemaAmericano();
        }
    }
    
}
