package controller;

import model.dao.CarroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class alterarCarroController extends HttpServlet {
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarroDAO carroDAO = new CarroDAO();
        int idCarro = Integer.parseInt(req.getParameter("idCarro"));
        
        String ano,capacidade,combustivel,cor,quilometragem,marca,modelo,placa;
        
        ano = req.getParameter("anoAlterar");
        capacidade = req.getParameter("capacidadeAlterar");
        combustivel = req.getParameter("combustivelAlterar");
        cor = req.getParameter("corAlterar");
        quilometragem = req.getParameter("quilometragemAlterar");
        marca = req.getParameter("marcaAlterar");
        modelo = req.getParameter("modeloAlterar");
        placa = req.getParameter("placaAlterar");
        
        
         System.out.println("Ano " + ano);
        
        
        
        System.out.println("ID CARRO " + idCarro);
        carroDAO.updateDadosCarro(idCarro, ano, capacidade, combustivel, cor, quilometragem, marca, modelo, placa);
    }

  */  

}
