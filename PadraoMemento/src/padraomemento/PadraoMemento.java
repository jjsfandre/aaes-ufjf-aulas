/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraomemento;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jjsfa
 */
public class PadraoMemento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<AlunoMemento> estadosSalvos = new ArrayList();
        
        Aluno aluno = new Aluno();
        aluno.setNome("Marco");
        aluno.setEstado(new AlunoEstadoTrancado());
        estadosSalvos.add(aluno.saveToMemento());
        aluno.setEstado(new AlunoEstadoAtivo());
        estadosSalvos.add(aluno.saveToMemento());
        aluno.setEstado(new AlunoEstadoFormado());
        estadosSalvos.add(aluno.saveToMemento());
        
        for(Iterator i = estadosSalvos.iterator();i.hasNext();)
            System.out.println(i.next());
        aluno.restoreFromMemento(estadosSalvos.get(1));
        System.out.println(aluno.getNomeEstado());
    }
    
}
