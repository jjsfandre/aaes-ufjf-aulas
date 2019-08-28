/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ice
 */
public class Contato {
    private Long id;
    private String nome;
    private String email;
    private Long idEmpresa;
    private String nomeEmpresa;

    public Contato() {
    }
    
    public Contato(Long id, String nome, String email, Long idEmpresa) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idEmpresa = idEmpresa;
    }

    public Contato(String nome, String email, Long idEmpresa) {
        this.nome = nome;
        this.email = email;
        this.idEmpresa = idEmpresa;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    
    
    
    
    
}
