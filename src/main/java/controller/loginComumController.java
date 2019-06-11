
package controller;

import model.bean.Usuario;
import model.dao.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class loginComumController extends HttpServlet {

  
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email,senha;
        Usuario usuario;
        HttpSession session = req.getSession();
        email = req.getParameter("emailLogin");
        senha = req.getParameter("senhaLogin");
        
        UsuarioDAO dao = new UsuarioDAO();
        usuario = dao.loginUsuario(email,senha);
        
    
     
        if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
            
            if(usuario.getGrupoId().equals("1")){
                 //USUARIO ADM
              
                session.setAttribute("usuarioEmail", usuario.getEmail());
                session.setAttribute("usuarioGrupoId","1");//problema pode ta no get
                resp.sendRedirect("paginaAdm.jsp");
            }else{
                //USUARIO COMUM
              
                session.setAttribute("usuarioEmail", usuario.getEmail());
                session.setAttribute("usuarioGrupoId","2");//problema pode ta no get
                resp.sendRedirect("index.jsp");
            }

        }else{
            
            session.setAttribute("erro", "erro");
        }
        
    }

    

}
