/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsabilityexample;

import java.util.ArrayList;

/**
 *
 * @author jjsfa
 */
public abstract class Funcionario {
    protected ArrayList listaCompras = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }
    
    public abstract String getDescricaoCargo();
    
    public String autorizarCompra(Compra compra){
        if (listaCompras.contains(compra.getTipoCompra())){
            return getDescricaoCargo()+"|"+solicitaAutorizacaoSuperior(compra);
        }
        else{
            return solicitaAutorizacaoSuperior(compra);
            /*if (funcionarioSuperior != null){
                return funcionarioSuperior.autorizarCompra(compra);
            }else{
                return "Autorizada";
            }*/
        }
    }
    
    private String solicitaAutorizacaoSuperior(Compra compra){
        if (funcionarioSuperior == null){
            return "Autorizada";
        }
        else{
            return funcionarioSuperior.autorizarCompra(compra);
        }
    }
    
}
