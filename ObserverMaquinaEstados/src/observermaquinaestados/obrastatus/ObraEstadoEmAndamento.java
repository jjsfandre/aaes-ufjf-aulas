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
public class ObraEstadoEmAndamento implements ObraEstado{

    @Override
    public String iniciarProjeto() {
        return "Projeto já finalizado. Obra em andamento";
    }

    @Override
    public String iniciar() {
        return "Obra já se encontra em andamento";
    }

    @Override
    public String suspender() {
        return "Obra suspensa";
    }

    @Override
    public String finalizar() {
        return "Obra finalizada";
    }

    @Override
    public String getEstado() {
        return "Em andamento";
    }
    
}
