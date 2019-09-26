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
public class TipoCompraPequena implements TipoCompra{
    private static TipoCompraPequena tipoCompraPequena = 
            new TipoCompraPequena();
    
    public static TipoCompraPequena getTipoCompraPequena(){
        return tipoCompraPequena;
    }
}
