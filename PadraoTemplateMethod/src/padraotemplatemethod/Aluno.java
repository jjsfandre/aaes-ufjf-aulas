/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraotemplatemethod;

/**
 *
 * @author Marco
 */
public abstract class Aluno {
    
    private String nome;
    private String instituicaoOrigem;
    
    public abstract String getOrigem();
    
    public String getDadosAluno() {
        return "Aluno: " + getNome() + " - Origem: " + getOrigem() 
                + getInstituicaoOrigem();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the instituicaoOrigem
     */
    public String getInstituicaoOrigem() {
        return instituicaoOrigem;
    }

    /**
     * @param instituicaoOrigem the instituicaoOrigem to set
     */
    public void setInstituicaoOrigem(String instituicaoOrigem) {
        this.instituicaoOrigem = instituicaoOrigem;
    }
}
