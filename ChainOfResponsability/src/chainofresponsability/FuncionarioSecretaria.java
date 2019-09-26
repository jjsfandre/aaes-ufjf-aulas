/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author jjsfa
 */
public class FuncionarioSecretaria extends Funcionario{
    
    public FuncionarioSecretaria(Funcionario superior){
        listaDocumentos.add(TipoDocumentoHistorico.getTipoDocumentoHistorico());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo(){
        return "Secretaria";
    }
}
