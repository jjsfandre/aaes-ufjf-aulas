/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocomposite;

/**
 *
 * @author Marco
 */
public abstract class Conteudo {
    protected String descricao;

    public Conteudo(String descricao) {
        this.descricao = descricao;
    }
    /**
     * @return the descricao
     */
   /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public abstract String getDescricao();
   }
