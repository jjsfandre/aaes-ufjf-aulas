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
public class TipoCompraTrivial implements TipoCompra{
    private static TipoCompraTrivial tipoCompraTrivial = 
            new TipoCompraTrivial();
    
    public static TipoCompraTrivial getTipoCompraTrivial(){
        return tipoCompraTrivial;
    }
}
