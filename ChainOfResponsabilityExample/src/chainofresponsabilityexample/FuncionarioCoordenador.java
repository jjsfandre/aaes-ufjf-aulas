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
public class FuncionarioCoordenador extends Funcionario{
    
    public FuncionarioCoordenador(Funcionario superior){
        listaCompras.add(TipoCompraPequena.getTipoCompraPequena());
        listaCompras.add(TipoCompraMedia.getTipoCompraMedia());
        listaCompras.add(TipoCompraGrande.getTipoCompraGrande());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo(){
        return "Coordenador";
    }
}
