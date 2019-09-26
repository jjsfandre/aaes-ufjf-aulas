/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observermaquinaestados;

import java.util.Observable;
import observermaquinaestados.obrastatus.ObraEstado;
import observermaquinaestados.obrastatus.ObraEstadoEmProjeto;
import observermaquinaestados.obrastatus.ObraEstadoFinalizada;

/**
 *
 * @author jjsfa
 */
public class Obra extends Observable{
    
    private int id;
    private String descricao;
    private ObraEstado estado;

    public Obra(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.estado = new ObraEstadoEmProjeto();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstadoToString() {
        return estado.getEstado();
    }
    
    public ObraEstado getEstado(){
        return estado;
    }

    public void setEstado(ObraEstado estado) {
        this.estado = estado;
        if (estado instanceof ObraEstadoFinalizada){
            setChanged();
            notifyObservers();
        }
    }
    
    
    
}
