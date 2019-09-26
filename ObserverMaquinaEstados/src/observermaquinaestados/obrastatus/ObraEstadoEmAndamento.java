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
public class ObraEstadoEmAndamento implements ObraEstado{

    @Override
    public String iniciarProjeto(Obra o) {
        return "Projeto já finalizado. Obra em andamento";
    }

    @Override
    public String iniciar(Obra o) {
        return "Obra já se encontra em andamento";
    }

    @Override
    public String suspender(Obra o) {
        o.setEstado(new ObraEstadoSuspensa());
        return "Obra suspensa";
    }

    @Override
    public String finalizar(Obra o) {
        o.setEstado(new ObraEstadoFinalizada());
        return "Obra finalizada";
    }

    @Override
    public String getEstado() {
        return "Em andamento";
    }
    
}
