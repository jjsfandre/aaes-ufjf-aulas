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
public class TipoDocumentoHistorico implements TipoDocumento{
    
    private static TipoDocumentoHistorico tipoDocumentoHistorico = 
            new TipoDocumentoHistorico();
    
    public static TipoDocumentoHistorico getTipoDocumentoHistorico(){
        return tipoDocumentoHistorico;
    }
}
