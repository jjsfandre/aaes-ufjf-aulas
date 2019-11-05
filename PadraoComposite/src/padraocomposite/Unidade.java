/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocomposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marco
 */
public class Unidade extends Conteudo {
    private ArrayList conteudos = new ArrayList();
    
    public Unidade(String descricao) {
        super (descricao);
    }
    
    public void addConteudo (Conteudo conteudo) {
        conteudos.add(conteudo);
    }
       
    public String getDescricao() {
        String descricaoSaida = this.descricao + "\n";
        for (Iterator i = conteudos.iterator();i.hasNext();) {
            Conteudo conteudo = (Conteudo)i.next();
            descricaoSaida = descricaoSaida + conteudo.getDescricao();
        }
        return descricaoSaida;
    }
    
}
    
   
