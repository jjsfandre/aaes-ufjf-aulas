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
public class FuncionarioDiretor extends Funcionario{
    
    public FuncionarioDiretor(Funcionario superior){
        listaDocumentos.add(TipoDocumentoCertificado.getTipoDocumentoCertificado());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo(){
        return "Diretor";
    }
}
