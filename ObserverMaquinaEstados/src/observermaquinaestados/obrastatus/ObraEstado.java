/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observermaquinaestados.obrastatus;

/**
 *
 * @author jjsfa
 */
public interface ObraEstado {
    
    public String getEstado();
    
    public String iniciarProjeto();
    
    public String iniciar();
    
    public String suspender();
    
    public String finalizar();
}
