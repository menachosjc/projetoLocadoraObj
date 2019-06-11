package controller;

import model.bean.Usuario;
import model.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.Session;



public class loginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email,senha;
        Usuario usuario;
        
 

        email = req.getParameter("emailLogin");
        senha = req.getParameter("senhaLogin");
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuario = usuarioDao.loginUsuario(email,senha);
        
        if(usuario.getEmail().equalsIgnoreCase(email) && usuario.getSenha().equalsIgnoreCase(senha) && usuario.getGrupoId().equals("1")){
            PrintWriter escritorResposta = resp.getWriter();
           
            //USUARIO ADM
            HttpSession session = req.getSession();
            session.setAttribute("usuarioEmail", usuario.getEmail());
            session.setAttribute("usuarioGrupoId", usuario.getGrupoId());
           
      
            
    
            
            resp.sendRedirect("paginaAdm.jsp");
           
        }else{
 
            //USUARIO COMUM
            HttpSession session = req.getSession();
            session.setAttribute("usuarioEmail", usuario.getEmail());
            session.setAttribute("usuarioGrupoId", usuario.getGrupoId());
           

            
            resp.sendRedirect("index.jsp");
        }
        

        

        
        
        
        


    }

}
