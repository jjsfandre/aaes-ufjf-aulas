/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsabilityexample;

/**
 *
 * @author jjsfa
 */
public class FuncionarioSecretario extends Funcionario{
    
    public FuncionarioSecretario(Funcionario superior){
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo(){
        return "Secretario";
    }
}
