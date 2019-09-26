/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import state.*;
import memento.*;

/**
 *
 * @author jjsfa
 */
public class Aluno {
    
    private String nome;
    private Long id;
    private AlunoEstado estado;
    
    public Aluno(){
        this.estado = new AlunoEstadoAtivo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Aluno(Long id, String nome, String estado) {
        this.id = id;
        this.nome = nome;
        this.setEstadoByName(estado);
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

    private void setEstadoByName(String estado) {
        this.estado = getEstadoByName(estado);
    }
    private AlunoEstado getEstadoByName(String estado){
        if (estado.equals("ativo"))
            return new AlunoEstadoAtivo();
        if (estado.equals("formado"))
            return new AlunoEstadoFormado();
        if (estado.equals("trancado"))
            return new AlunoEstadoTrancado();
        
        return null;
    }
}
