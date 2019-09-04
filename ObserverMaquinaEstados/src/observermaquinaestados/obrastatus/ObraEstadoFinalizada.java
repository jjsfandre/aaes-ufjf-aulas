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
public class ObraEstadoFinalizada implements ObraEstado {

    @Override
    public String iniciarProjeto() {
        return "Projeto não pode ser inciado. Obra já finalizada.";
    }

    @Override
    public String iniciar() {
        return "Obra não pode ser iniciada. Obra já finalizada.";
    }

    @Override
    public String suspender() {
        return "Obra não pode ser suspensa. Obra já finalizada.";
    }

    @Override
    public String finalizar() {
        return "Obra finalizada.";
    }

    @Override
    public String getEstado() {
        return "Finalizada";
    }
    
}
