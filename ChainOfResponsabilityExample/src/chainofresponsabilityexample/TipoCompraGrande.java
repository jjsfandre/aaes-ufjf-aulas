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
public class TipoCompraGrande implements TipoCompra{
    private static TipoCompraGrande tipoCompraGrande = 
            new TipoCompraGrande();
    
    public static TipoCompraGrande getTipoCompraGrande(){
        return tipoCompraGrande;
    }
}
