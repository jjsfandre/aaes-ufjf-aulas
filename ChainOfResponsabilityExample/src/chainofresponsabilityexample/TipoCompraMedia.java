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
public class TipoCompraMedia implements TipoCompra{
    private static TipoCompraMedia tipoCompraMedia = 
            new TipoCompraMedia();
    
    public static TipoCompraMedia getTipoCompraMedia(){
        return tipoCompraMedia;
    }
}
