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
import model.Contato;

/**
 *
 * @author Anderson
 */
public class ContatoDAO {
    private static ContatoDAO instance = new ContatoDAO();
    public static ContatoDAO getInstance(){
        return instance;
    }
    
    public void save(Contato contato) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                st.execute("insert into contato (nome, email)" +
                        " values ('" + contato.getNome() + "', '" + contato.getEmail() + "')");
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

    public void deleteByEmail(String email)  throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                st.execute("delete from contato where email = '" + email+"'");
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
    }
    
    public List<Contato> getContatosByEmail(String emailParam)  throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        List<Contato> listaContatos = new ArrayList();
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                
                // execute the query, and get a java resultset
                ResultSet rs = st.executeQuery("select nome,email from contato where email = '" + emailParam+"'");
                
                // iterate through the java resultset
                while (rs.next())
                {
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    listaContatos.add(new Contato(nome,email));
                }
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
        return listaContatos;
    }

}
