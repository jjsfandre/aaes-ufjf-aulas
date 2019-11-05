/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraotemplatemethod;

/**
 *
 * @author Marco
 */
public class PadraoTemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlunoGraduacao aluno1 = new AlunoGraduacao();
        aluno1.setNome("Marco");
        aluno1.setInstituicaoOrigem("Granbery");
        
        AlunoPosGraduacao aluno2 = new AlunoPosGraduacao();
        aluno2.setNome("Antonio");
        aluno2.setInstituicaoOrigem("Granbery");
        
        System.out.println(aluno1.getDadosAluno());
        
        System.out.println(aluno2.getDadosAluno());
        
    }
}
