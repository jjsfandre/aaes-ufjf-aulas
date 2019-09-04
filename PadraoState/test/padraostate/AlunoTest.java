/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

import junit.framework.Test;
import junit.framework.TestCase;

/**
 *
 * @author Marco
 */
public class AlunoTest extends TestCase {
    private Aluno aluno;
    
    public AlunoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        aluno = new Aluno();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of matricular method, of class Aluno.
     */
   
    public void testMatriculaAlunoAtivo() {
        aluno.setEstado(new AlunoEstadoAtivo());
        assertEquals ("Matrícula já realizada", aluno.matricular());
    }
    
    public void testMatriculaAlunoFormado() {
        aluno.setEstado(new AlunoEstadoFormado());
        assertEquals ("Matrícula não pode ser realizada", aluno.matricular());
    }
        
    public void testMatriculaAlunoTrancado() {
        aluno.setEstado(new AlunoEstadoTrancado());
        assertEquals ("Matrícula não pode ser realizada", aluno.matricular());
    }

    
}
