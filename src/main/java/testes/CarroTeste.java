/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.List;

import com.db4o.ObjectSet;
import com.google.gson.Gson;

import model.bean.Carro;
import model.bean.Usuario;
import model.dao.CarroDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author Menacho
 */
public class CarroTeste {
	
	
    public static void main(String[] args){
    	
    	String email,senha;
        Usuario usuario = new Usuario();
        
        email = "menacho.sjc@gmail.com";
        senha = "123";
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuario = usuarioDao.loginUsuario(email,senha);
    	   
    	 /*
    	 String emailLogin = "menacho.sjc@gmail.com";
         
         Usuario usuario = new Usuario(emailLogin);
         UsuarioDAO usuarioDao = new UsuarioDAO();
         
         usuario = usuarioDao.procurarEmail(emailLogin);
         System.out.println(usuario.paraJSONString());
    	
    	CarroDAO carroDao = new CarroDAO();
         Gson gson = new Gson();
         Carro carro = new Carro();
         
         
         
         String data = gson.toJson(carroDao.listarCarros(carro));
         System.out.println(data);
    	
    	Usuario usuario = new Usuario();

    	UsuarioDAO.listarUsuarios(usuario);
    	   
       
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
        String email = "menacho.sjc@gmail.com";
        String nome,sobrenome,endereco,cidade,estado, cep, senha,grupoId;
        
        nome = "Gabriel";
        sobrenome = "Madeira Menacho";
        endereco = "Rua Gregoriuzinhu";
        cidade = "SAUN rosu";
        estado = "IESP";
        cep = "12223140";
        senha = "123";
        grupoId = "1";
     
       usuarioDAO.updateDadosUsuario(nome, sobrenome, endereco, cidade, estado, cep, email, senha, grupoId);
    	 


    	
  
        CarroDAO dao = new CarroDAO();
        
        Carro carro = new Carro();
        Carro carro1 = new Carro();
  
        carro.setAno("2009");
        carro.setCapacidade("10");
        carro.setCombustivel("flex");
        carro.setCor("Cinza");
        carro.setId(1);
        carro.setMarca("fiat");
        carro.setModelo("palio");
        carro.setPlaca("DXD9250");
        carro.setQuilometragem("177000");
        carro.setStatus(1);
       
        dao.cadastrarCarro(carro);
        
        dao.listarCarros(carro1);
  
    	Usuario usuario = new Usuario();
    	
    	UsuarioDAO.listarUsuarios(usuario);
   
        
        dao.deletarCarro(1);
         
    	
    	String email,senha;
        Usuario usuario = new Usuario();
        
        email = "menacho.sjc@gmail.com";
        senha = "123";
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuario = usuarioDao.loginUsuario(email,senha);
        
        if(usuario.getEmail().equalsIgnoreCase(email)
        		&& usuario.getSenha().equalsIgnoreCase(senha) 
        		){
        	System.out.println("Usuario Logado");
        }else {
        	System.out.println("Usuari não logado");
        }
   
    
    	CarroDAO carroDAO = new CarroDAO();
        int idCarro = 1;
        String ano,capacidade,combustivel,cor,quilometragem,marca,modelo,placa;
        
        ano = "2020";
        capacidade = "20";
        combustivel = "gasolina";
        cor = "rosa";
        quilometragem = "00000";
        marca = "chevrolet";
        modelo = "celtinha";
        placa = "DXD9250";
     
        carroDAO.updateDadosCarro(idCarro, ano, capacidade, combustivel, cor, quilometragem, marca, modelo, placa);
    	 	String email = "menacho.sjc@gmail.com";
        Usuario usuario = new Usuario(email);
    	UsuarioDAO dao = new UsuarioDAO();
    	usuario = dao.procurarEmail(email);
    	
    
    	*/
    
    }
    
}
