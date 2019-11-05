/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author Marco
 */
public class PromocaoQueimaEstoque implements Promocao {
    
      public int obterDesconto() {
            return 20;
        }

      public String obterPromocao() {
            return "Queima de Estoque";
        }
 
}
