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
public class Compra {
    private TipoCompra tipoCompra;

    public Compra(TipoCompra tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public TipoCompra getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(TipoCompra tipoCompra) {
        this.tipoCompra = tipoCompra;
    }
    
    
}
