/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.bean.Usuario;
import model.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class ajaxLoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String emailLogin;
        PrintWriter escritorResposta = resp.getWriter();

        emailLogin = req.getParameter("emailLogin");
        
        Usuario usuario = new Usuario(emailLogin);
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        usuario = usuarioDao.procurarEmail(emailLogin);
      
        escritorResposta.write(usuario.paraJSONString());
        escritorResposta.close();

    }

}
