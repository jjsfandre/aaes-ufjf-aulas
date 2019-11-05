/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocomposite;

/**
 *
 * @author Marco
 */
public class PadraoComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Disciplina disciplina = new Disciplina();
        Secao secao111 = new Secao("Seção 1.1.1");
        Secao secao112 = new Secao("Seção 1.1.2");
        Unidade unidade11 = new Unidade("Unidade 1.1");
        Unidade unidade1 = new Unidade("Unidade 1");
        unidade1.addConteudo(unidade11);
        unidade11.addConteudo(secao111);
        unidade11.addConteudo(secao112);
        disciplina.addConteudo(unidade1);
        Secao secao21 = new Secao("Seção 2.1");
        Unidade unidade2 = new Unidade("Unidade 2");
        unidade2.addConteudo(secao21);
        disciplina.addConteudo(unidade2);

        disciplina.listarEmenta();
    }
}
