/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author Marco
 */
public class PadraoState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Thiago");
        aluno.setEstado(new AlunoEstadoAtivo());
        System.out.println ("Aluno " + aluno.getNome() + 
                " está no estado " + aluno.getNomeEstado() + 
                " - " + aluno.formar());
        aluno.setEstado(new AlunoEstadoTrancado());
        System.out.println ("Aluno " + aluno.getNome() + 
                " está no estado " + aluno.getNomeEstado() + 
                " - " + aluno.formar());
        aluno.setEstado(new AlunoEstadoAtivo());
        System.out.println ("Aluno " + aluno.getNome() + 
                " está no estado " + aluno.getNomeEstado() + 
                " - " + aluno.formar());
        
    }
}
