/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author Marco
 */
public class AlunoEstadoAtivo implements AlunoEstado {
 
    public String getEstado() {
        return "Ativo";
    }
    
    public String matricular() {
        return "Matrícula já realizada";
    }
    
    public String formar() {
        return "Aluno formado";
    }
}
