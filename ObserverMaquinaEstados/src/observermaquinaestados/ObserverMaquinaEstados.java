/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observermaquinaestados;

import observermaquinaestados.obrastatus.ObraEstadoEmProjeto;
import observermaquinaestados.obrastatus.ObraEstadoFinalizada;

/**
 *
 * @author jjsfa
 */
public class ObserverMaquinaEstados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supervisor s1 = new Supervisor("João");
        Supervisor s2 = new Supervisor("Maria");
        
        Obra o1 = new Obra(1, "Casa");
        Obra o2 = new Obra(2, "Prédio");
        
        s1.addObserver(o1);
        s2.addObserver(o2);
        
        o1.setEstado(new ObraEstadoEmProjeto());
        o2.setEstado(new ObraEstadoEmProjeto());
        
        o1.setEstado(new ObraEstadoFinalizada());
        o2.setEstado(new ObraEstadoFinalizada());
    }
    
}
