/* Padrão de projeto Singleton.
 * DAO - Objeto de acesso a dados.
 * 
 * 
 */
package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

/**
 *
 * @author Anderson
 */
public class AlunoDAO {
    private static AlunoDAO instance = new AlunoDAO();
    public static AlunoDAO getInstance(){
        return instance;
    }
    
    public void save(Aluno aluno) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                st.execute("insert into aluno (nome, estado)" +
                        " values ('" + aluno.getNome() + "', '" + aluno.getNomeEstado()+ 
                        "')");
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
    }

    private void closeResources(Connection conn, Statement st) {
        try {
            if(st!=null) st.close();
            if(conn!=null) conn.close();
        } catch(SQLException e) {

        }
    }
    
    public List<Aluno> getAlunos()  throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        List<Aluno> listaContatos = new ArrayList();
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                
                // execute the query, and get a java resultset
                ResultSet rs = st.executeQuery("select id,nome,estado from aluno ");
                
                // iterate through the java resultset
                while (rs.next())
                {
                    String nome = rs.getString("nome");
                    String estado = rs.getString("estado");
                    Long id = rs.getLong("id");
                    listaContatos.add(new Aluno(id, nome,estado));
                }
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
        return listaContatos;
    }

    public Aluno getAlunoById(Long _id) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        Aluno aluno = null;
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                
                // execute the query, and get a java resultset
                ResultSet rs = st.executeQuery("select id,nome,estado from aluno where id= "+_id);
                rs.first();
                String nome = rs.getString("nome");
                String estado = rs.getString("estado");
                Long id = rs.getLong("id");
                aluno = new Aluno(id,nome,estado);
                // iterate through the java resultset
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
        return aluno;
    }

}
