/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author jjsfa
 */
public class AlunoEstadoFormado implements AlunoEstado{

    @Override
    public String getEstado() {
        return "Formado";
    }

    @Override
    public String matricular() {
        return "Matrícula não pode ser realizada";
    }    
}
