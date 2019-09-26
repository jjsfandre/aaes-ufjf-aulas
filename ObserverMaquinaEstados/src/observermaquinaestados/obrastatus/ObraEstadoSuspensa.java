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
public class ObraEstadoSuspensa implements ObraEstado {

    @Override
    public String iniciarProjeto(Obra o) {
        o.setEstado(new ObraEstadoEmProjeto());
        return "Projeto iniciado";
    }

    @Override
    public String iniciar(Obra o) {
        o.setEstado(new ObraEstadoEmAndamento());
        return "Obra iniciada";
    }

    @Override
    public String suspender(Obra o) {
        return "Obra já se encontra suspensa";
    }

    @Override
    public String finalizar(Obra o) {
        o.setEstado(new ObraEstadoFinalizada());
        return "Obra finalizada";
    }

    @Override
    public String getEstado() {
        return "Suspensa";
    }
    
}
