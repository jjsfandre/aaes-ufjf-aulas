/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author Marco
 */
public class Aluno {
    
    private String nome;
    private AlunoEstado estado;
    

    public Aluno() {
        this.estado = new AlunoEstadoAtivo();
    }
    
    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }
    
    public String matricular() {
        return estado.matricular();
    }
    
    public String formar() {
        return estado.formar();
    }
    
    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }    
}
