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
public class ChainOfResponsabilityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FuncionarioDiretor diretor = new FuncionarioDiretor(null);
        FuncionarioGerente gerente = new FuncionarioGerente(diretor);
        FuncionarioCoordenador coordenador = new FuncionarioCoordenador(gerente);
        FuncionarioSecretario secretario = new FuncionarioSecretario(coordenador);
        
        
        System.out.println("Compra trivial:"+
            secretario.autorizarCompra(
                    new Compra(TipoCompraTrivial.getTipoCompraTrivial())
            )
        );     
        System.out.println("Compra pequena:"+
            secretario.autorizarCompra(
                    new Compra(TipoCompraPequena.getTipoCompraPequena())
            )
        );   
        System.out.println("Compra media:"+
            secretario.autorizarCompra(
                    new Compra(TipoCompraMedia.getTipoCompraMedia())
            )
        ); 
        System.out.println("Compra grande:"+
            secretario.autorizarCompra(
                    new Compra(TipoCompraGrande.getTipoCompraGrande())
            )
        );  
    }
    
}
