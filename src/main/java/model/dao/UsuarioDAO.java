/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import model.bean.Carro;
import model.bean.Usuario;

import java.util.List;

import javax.persistence.*;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author Administrator
 */

public class UsuarioDAO {
   
	static ObjectContainer em = new ConnectionFactory().getConnection();
    public UsuarioDAO() {}

    public Usuario cadastrarUsuario(Usuario usuario) {
      
    	 try {

             
             em.store(usuario);
            

         } catch (Exception e) {
             
             System.err.println(e);
             
         } 

         return usuario;

    }
    
    
    public static void listarUsuarios(Usuario usuario){
    	
    	 List<?> result = em.queryByExample(usuario);
    	 System.out.println(result.size());
    	 
    	
    	 for (int i = 0; i < result.size(); i++) {
    		 usuario = (Usuario) result.get(i);
    		 System.out.println(usuario.getNome());
    		 System.out.println(usuario.getEmail());
    		 System.out.println(usuario.getSenha());
    		 System.out.println("Grupo ID " + usuario.getGrupoId());
		}
    }
    
    
    public Usuario loginUsuario(String email, String senha){
    		Usuario usuario = new Usuario(email, senha);
        try {
        	List<?> result = em.queryByExample(usuario);
            for (int i = 0; i < result.size(); i++) {
       		 usuario = (Usuario) result.get(i);
       		 
       		}
        	return usuario;
        } catch (NoResultException e) {
            return null;
        }
       
    }
    
    public Usuario procurarEmail(String email) {
        

        
        Usuario usuario = new Usuario(email);

        try {
        	List<?> result = em.queryByExample(usuario);
            for (int i = 0; i < result.size(); i++) {
            	usuario = (Usuario) result.get(i);
            	System.out.println(usuario.getNome());
       		 System.out.println(usuario.getEmail());
       		 System.out.println(usuario.getSenha());
       		 System.out.println(usuario.getGrupoId());
       		}
        	return usuario;
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public Usuario updateDadosUsuario(String nome, String sobrenome, String endereco,String cidade, String estado, String cep, String email, String senha, String grupoId){
        Usuario usuario = new Usuario(email);
        	
        try {
        	ObjectSet result = em.queryByExample(usuario);
        	Usuario usuarioEncontrado = (Usuario) result.next();
        	
        	usuarioEncontrado.setNome(nome);
            usuarioEncontrado.setSobrenome(sobrenome);
            usuarioEncontrado.setEndereco(endereco);
            usuarioEncontrado.setCidade(cidade);
            usuarioEncontrado.setEstado(estado); 
            usuarioEncontrado.setEmail(email);
            usuarioEncontrado.setSenha(senha);
            usuarioEncontrado.setGrupoId(grupoId);
        	
            em.store(usuarioEncontrado);    	
             
        } catch (Exception e) {
            System.out.println(e);
            
        } 

        return usuario;
    }
    
    /*
    public Usuario loginUsuario(String email, String senha){
        try {
            Usuario usuario = (Usuario) em.createQuery("select u from Usuario u where u.email = :email and u.senha = :senha").setParameter("email", email).setParameter("senha", senha).getSingleResult();
            return usuario;
        } catch (NoResultException e) {
            return null;
        }
       
    }
    
 
*/
}
