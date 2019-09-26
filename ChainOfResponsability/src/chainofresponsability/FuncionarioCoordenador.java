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
public class FuncionarioCoordenador extends Funcionario{
    
    public FuncionarioCoordenador(Funcionario superior){
        listaDocumentos.add(TipoDocumentoMatricula.getTipoDocumentoMatricula());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo(){
        return "Coordenador";
    }
}
