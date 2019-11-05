/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author Marco
 */
public class PromocaoNatal implements Promocao {
    
      public int obterDesconto() {
            return 15;
        }
      
        public String obterPromocao() {
            return "Natal";
        }

}
