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
import model.Empresa;

/**
 *
 * @author Anderson
 */
public class EmpresaDAO {
    private static EmpresaDAO instance = new EmpresaDAO();
    public static EmpresaDAO getInstance(){
        return instance;
    }
    
    public void save(Empresa empresa) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                st.execute("insert into empresa (nome)" +
                        " values ('" + empresa.getNome() + "')");
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

    public void deleteByNome(String nome)  throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                st.execute("delete from empresa where nome = '" + nome+"'");
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
    }
    
    public List<Empresa> getEmpresasByNome(String nomeParam)  throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        List<Empresa> listaEmpresas = new ArrayList();
        try {
                conn = DatabaseLocator.getInstance().getConection();
                st = conn.createStatement();
                
                // execute the query, and get a java resultset
                ResultSet rs = st.executeQuery("select id,nome from empresa where nome = '" + nomeParam+"'");
                
                // iterate through the java resultset
                while (rs.next())
                {
                    Long id = rs.getLong("id");
                    String nome = rs.getString("nome");
                    
                    listaEmpresas.add(new Empresa(id,nome));
                }
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
        return listaEmpresas;
    }

}
