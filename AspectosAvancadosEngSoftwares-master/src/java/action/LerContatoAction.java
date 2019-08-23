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
import persistence.ContatoDAO;

/**
 *
 * @author jjsfa
 */
public class LerContatoAction implements Action{
    public void execute(HttpServletRequest request,HttpServletResponse response)
            throws IOException{
        String email = request.getParameter("textEmail");
        
        if(email.equals("")) {
           //<p>Nome e email sao dados obrigatorios...</p>
        } else {
            try{
                List<Contato> listContatos = ContatoDAO.getInstance().getContatosByEmail(email);
                request.setAttribute("listContatos", listContatos);
                request.getRequestDispatcher("contatoListagem.jsp").forward(request, response);
            } catch(SQLException ex){
                response.sendRedirect("contatoErro.jsp");
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ServletException ex) {
                Logger.getLogger(LerContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
