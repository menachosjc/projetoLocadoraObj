package controller;

import model.dao.CarroDAO;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class listarDadosCarroController extends HttpServlet {
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter escritorResposta = resp.getWriter();

        CarroDAO carroDAO = new CarroDAO();
        int idCarro = Integer.parseInt(req.getParameter("idCarro"));
        System.out.println("ID CARRO " + idCarro);
        Gson gson = new Gson();
        
        String data = gson.toJson(carroDAO.listarDadosCarro(idCarro));
        escritorResposta.write(data);
        escritorResposta.close();
    }
*/
	
	
}
