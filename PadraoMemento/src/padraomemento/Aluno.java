/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraomemento;

/**
 *
 * @author jjsfa
 */
public class Aluno {
    
    private String nome;
    private AlunoEstado estado;
    
    public Aluno(){
        this.estado = new AlunoEstadoAtivo();
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

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }
    
    public String matricular(){
        return estado.matricular();
    }
    
    public String getNomeEstado(){
        return estado.getEstado();
    }
    
    public AlunoMemento saveToMemento(){
        return new AlunoMemento(estado);
    }
    
    public void restoreFromMemento (AlunoMemento memento){
        estado = memento.getEstadoSalvo();
    }
    
}
