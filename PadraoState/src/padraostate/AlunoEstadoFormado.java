/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author Marco
 */
public class AlunoEstadoFormado implements AlunoEstado {
    
    public String getEstado() {
        return "Formado";
    }
    
    public String matricular() {
        return "Matrícula não pode ser realizada";
    }
    
   public String formar() {
        return "Aluno jah formado";
    }
}
