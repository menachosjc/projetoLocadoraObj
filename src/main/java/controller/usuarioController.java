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
public class usuarioController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
       
        PrintWriter escritorResposta = resp.getWriter();

        String nome, sobrenome,endereco,cidade,estado,cep,email,senha,grupoId = "2";
        
        nome = req.getParameter("nome");
        sobrenome = req.getParameter("sobrenome");
        endereco = req.getParameter("endereco");
        cidade = req.getParameter("cidade");
        estado = req.getParameter("estado");
        cep = req.getParameter("cep");
        email = req.getParameter("email");
        senha = req.getParameter("senha");
        grupoId = req.getParameter("grupoId");
        if(grupoId == null){
            grupoId = "2";
        }
     
        
        
        Usuario usuario = new Usuario(nome, sobrenome, endereco, cidade, estado, cep, email, senha, grupoId);
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuario = usuarioDao.cadastrarUsuario(usuario);
        
        escritorResposta.write(usuario.paraJSONString());
        escritorResposta.close();

        
                
        
        
       
    }
    


    
}
