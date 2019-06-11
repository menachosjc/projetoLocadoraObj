
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


public class validarLogin extends HttpServlet {
 /*   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String email,senha;
        Usuario usuario = new Usuario();
        
 

        email = req.getParameter("emailLogin");
        senha = req.getParameter("senhaLogin");
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuario = usuarioDao.loginUsuario(email,senha);
        
        if(usuario.getEmail().equalsIgnoreCase(email) && usuario.getSenha().equalsIgnoreCase(senha)){
            req.getSession().setAttribute("usuarioLogado", usuario);
            
            return;
        }
        
        System.out.println("Email digitado " + usuario.getEmail() );
        System.out.println("Senha digitada " + usuario.getSenha() );

        

        
        
        
        


    }
   
*/
}
