/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserverjava;

import java.util.Observable;

/**
 *
 * @author jjsfa
 */
public class Revista extends Observable{
    private int edicao;

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
        setChanged();
        notifyObservers();
    }
    
    
}
