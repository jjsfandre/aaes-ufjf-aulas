/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observermaquinaestados;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jjsfa
 */
public class Supervisor implements Observer{
    private String nome;

    public Supervisor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addObserver(Obra o){
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        String novoEstado;
        if (o instanceof Obra){
            Obra obra = (Obra) o;
            novoEstado = obra.getEstadoToString();
            System.out.println("Atenção "+ getNome() +
                    ", a obra " + obra.getDescricao() +
                     " teve seu estado alterado. " +
                    "O novo estado é:"+ novoEstado);
        }
    }
    
    
}
