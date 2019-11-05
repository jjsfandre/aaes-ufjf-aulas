/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author Marco
 */
public class TV extends Produto {
    
    public TV() {
        this.nome = "TV";
        this.promocao = new PromocaoQueimaEstoque();
        this.impressao = new ImpressaoImpressora();

    }
}
