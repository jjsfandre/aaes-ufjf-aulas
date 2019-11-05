/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author Marco
 */
public class Camera extends Produto {
    
    public Camera() {
        this.nome = "Câmera";
        this.promocao = new PromocaoDiaMaes();
        this.impressao = new ImpressaoPDF();
    } 
}
