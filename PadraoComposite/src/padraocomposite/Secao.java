/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocomposite;

/**
 *
 * @author Marco
 */
public class Secao extends Conteudo {
 
    public Secao(String descricao) {
        super (descricao);
    }
    
    public String getDescricao() {
        return descricao + "\n";
    }
}