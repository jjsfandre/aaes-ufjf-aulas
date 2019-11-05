/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author Marco
 */
public class Celular extends Produto {
    
    public Celular() {
        this.nome = "Celular";
        this.promocao = new PromocaoNatal();
        this.impressao = new ImpressaoPDF();

    }
}
