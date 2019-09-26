/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observermaquinaestados.obrastatus;

import observermaquinaestados.Obra;

/**
 *
 * @author jjsfa
 */
public interface ObraEstado {
    
    public String getEstado();
    
    public String iniciarProjeto(Obra o);
    
    public String iniciar(Obra o);
    
    public String suspender(Obra o);
    
    public String finalizar(Obra o);
}
