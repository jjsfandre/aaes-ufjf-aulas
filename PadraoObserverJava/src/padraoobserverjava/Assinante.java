/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserverjava;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jjsfa
 */
public class Assinante implements Observer{

    private String nome;

    public Assinante(Observable revista) {
        revista.addObserver(this);
    }    
    
    @Override
    public void update(Observable o, Object arg) {
        int novaEdicao;
        if (o instanceof Revista){
            Revista revista = (Revista) o;
            novaEdicao = revista.getEdicao();
            System.out.println("Atenção "+ getNome() +
                    ", já chegou mais uma edição da Revista. " +
                    "Esta é a sua edição número:"+ novaEdicao);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
