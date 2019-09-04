/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserverjava;

/**
 *
 * @author jjsfa
 */
public class PadraoObserverJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revista revista = new Revista();
        Assinante a1 = new Assinante(revista);
        Assinante a2 = new Assinante(revista);
        a1.setNome("João");
        a2.setNome("Maria");
        revista.setEdicao(2);
    }
    
}
