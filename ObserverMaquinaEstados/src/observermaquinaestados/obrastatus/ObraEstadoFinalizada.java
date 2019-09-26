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
public class ObraEstadoFinalizada implements ObraEstado {

    @Override
    public String iniciarProjeto(Obra o) {
        return "Projeto não pode ser inciado. Obra já finalizada.";
    }

    @Override
    public String iniciar(Obra o) {
        return "Obra não pode ser iniciada. Obra já finalizada.";
    }

    @Override
    public String suspender(Obra o) {
        return "Obra não pode ser suspensa. Obra já finalizada.";
    }

    @Override
    public String finalizar(Obra o) {
        o.setEstado(new ObraEstadoFinalizada());
        return "Obra finalizada.";
    }

    @Override
    public String getEstado() {
        return "Finalizada";
    }
    
}
