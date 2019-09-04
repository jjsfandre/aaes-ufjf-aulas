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
public class ObraEstadoSuspensa implements ObraEstado {

    @Override
    public String iniciarProjeto() {
        return "Projeto iniciado";
    }

    @Override
    public String iniciar() {
        return "Obra iniciada";
    }

    @Override
    public String suspender() {
        return "Obra já se encontra suspensa";
    }

    @Override
    public String finalizar() {
        return "Obra finalizada";
    }

    @Override
    public String getEstado() {
        return "Suspensa";
    }
    
}
