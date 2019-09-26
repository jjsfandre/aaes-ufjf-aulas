/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;
import state.*;

/**
 *
 * @author jjsfa
 */
public class AlunoMemento {
    private AlunoEstado estado;
    
    public AlunoMemento (AlunoEstado estadoSalvar){
        estado = estadoSalvar;
    }
    
    public AlunoEstado getEstadoSalvo(){
        return estado;
    }
    
    public String toString(){
        return estado.getEstado();
    }
}
