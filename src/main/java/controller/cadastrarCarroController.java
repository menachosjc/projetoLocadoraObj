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
public class cadastrarCarroController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	PrintWriter escritorResposta = resp.getWriter();


        String placa,marca,modelo,ano,cor,combustivel,quilometragem,capacidade;
        
        placa = req.getParameter("placa");
        marca = req.getParameter("marca");
        modelo = req.getParameter("modelo");
        ano = req.getParameter("ano");
        cor = req.getParameter("cor");
        combustivel = req.getParameter("combustivel");
        quilometragem = req.getParameter("quilometragem");
        capacidade = req.getParameter("capacidade");
        
        Carro carro = new Carro(placa, marca, modelo, ano, cor, combustivel, quilometragem, capacidade);
      
        
        CarroDAO carroDao = new CarroDAO();
        carro = carroDao.cadastrarCarro(carro);
        
        escritorResposta.write(carro.paraJSONString());
        escritorResposta.close();

        
                
    }

   
}
