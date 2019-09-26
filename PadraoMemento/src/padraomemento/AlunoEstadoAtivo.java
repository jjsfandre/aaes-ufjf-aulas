/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraomemento;

/**
 *
 * @author jjsfa
 */
public class AlunoEstadoAtivo implements AlunoEstado{

    @Override
    public String getEstado() {
        return "Ativo";
    }

    @Override
    public String matricular() {
        return "Matrícula realizada";
    }
    
}
