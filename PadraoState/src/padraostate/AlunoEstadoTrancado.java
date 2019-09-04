/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author Marco
 */
public class AlunoEstadoTrancado implements AlunoEstado {

    public String getEstado() {
        return "Trancado";
    }
    
    public String matricular() {
        return "Matrícula não pode ser realizada";
    }  
    
    public String formar() {
        return "Aluno nao pode formar";
    }
}
