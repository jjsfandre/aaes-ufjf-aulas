/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;
import model.Empresa;
import persistence.ContatoDAO;
import persistence.EmpresaDAO;

/**
 *
 * @author jjsfa
 */
public class LerEmpresaAction implements Action{
    public void execute(HttpServletRequest request,HttpServletResponse response)
            throws IOException{
        String nome = request.getParameter("textNome");
        
        if(nome.equals("")) {
           //<p>Nome e email sao dados obrigatorios...</p>
        } else {
            try{
                List<Empresa> listEmpresas = EmpresaDAO.getInstance().getEmpresasByNome(nome);
                request.setAttribute("listEmpresas", listEmpresas);
                request.getRequestDispatcher("Empresa/empresaListagem.jsp").forward(request, response);
            } catch(SQLException ex){
                response.sendRedirect("erro.jsp");
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ServletException ex) {
                Logger.getLogger(LerContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
