/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author Marco
 */
public abstract class Produto {
    
    protected Promocao promocao;
    protected String nome;
    protected Impressao impressao;
    
    public int desconto() {
        return promocao.obterDesconto();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getPromocao() {
        return promocao.obterPromocao();
    }
    
    public String getTipoImpressao() {
        return impressao.imprimir();
    }
    
}
