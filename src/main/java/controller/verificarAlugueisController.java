/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.bean.Carro;
import model.bean.Usuario;
import model.dao.CarroDAO;
import model.dao.UsuarioDAO;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Menacho
 */
public class verificarAlugueisController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          



        PrintWriter escritorResposta = resp.getWriter();

        CarroDAO carroDao = new CarroDAO();
        Gson gson = new Gson();
        Carro carro = new Carro();
        
        
        
        String data = gson.toJson(carroDao.listarCarros(carro));
      
        escritorResposta.write(data);
        escritorResposta.close();
    }

  
}
