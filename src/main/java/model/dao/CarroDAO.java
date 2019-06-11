/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import model.bean.Carro;
import model.bean.Usuario;
import java.sql.PreparedStatement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Criteria;
import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author Menacho
 */


public class CarroDAO {
    
	static ObjectContainer em = new ConnectionFactory().getConnection();
    public CarroDAO() {}

    public Carro cadastrarCarro(Carro carro) {
        

        try {

            
            em.store(carro);
           

        } catch (Exception e) {
            
            System.err.println(e);
            
        } 

        return carro;

    }

    
    public Carro listarCarros(Carro carro){
    	
    	 List<?> result = em.queryByExample(carro);
    	 System.out.println(result.size());
    	 
    	
    	 for (int i = 0; i < result.size(); i++) {
    		 carro = (Carro) result.get(i);
    		 
		}
    	 return carro;
    }
    
    public Carro updateDadosCarro(int id,String ano, String capacidade,String combustivel, String cor, String quilometragem, String marca,String modelo,String placa){
        Carro carro = new Carro(placa);
        	
        try {
        	ObjectSet result = em.queryByExample(carro);
        	Carro carroEncontrado = (Carro) result.next();
        	
        	carroEncontrado.setAno(ano);
            carroEncontrado.setCapacidade(capacidade);
            carroEncontrado.setCombustivel(combustivel);
            carroEncontrado.setCor(cor);
            carroEncontrado.setQuilometragem(quilometragem);
            carroEncontrado.setMarca(marca);
            carroEncontrado.setModelo(modelo);
            carroEncontrado.setPlaca(placa);
        	
            em.store(carroEncontrado);    	
             
        } catch (Exception e) {
            System.out.println(e);
            
        } 

        return carro;
    }

	
    
    /*
 
    public List<Carro> listarCarros(Carro carro) {
    	 List<Carro> lista = null;
      try {
    	  ObjectSet<Carro> result = em.queryByExample(carro);
    	 lista = result;
      } catch(Exception e) {
    	  System.out.println(e);
      } finally {
    	  em.close();
      }

    	
       

        return lista;

    }
    
    public Carro listarDadosCarro(int id) {

        
        Carro carro = new Carro();

        try {
        	ObjectSet result = em.queryByExample(carro);
            //carro = em.find(Carro.class, id);
            //em.getTransaction().begin();
            //em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            
        } finally {
            em.close();
        }

        return carro;

    }
    
  
    public Carro deletarCarro(int id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Carro carro = new Carro();

        try {
            carro = em.find(Carro.class, id);
            em.getTransaction().begin();
            em.remove(carro);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return carro;

    }
    
    public Carro listarDadosCarro(int id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Carro carro = new Carro();

        try {
            carro = em.find(Carro.class, id);
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return carro;

    }
    
    public Carro updateDadosCarro(int id,String ano, String capacidade,String combustivel, String cor, String quilometragem, String marca,String modelo,String placa){
        EntityManager em = new ConnectionFactory().getConnection();
        Carro carro = new Carro();
        
         try {
            carro = em.find(Carro.class, id);
            em.getTransaction().begin();
            carro.setAno(ano);
            carro.setCapacidade(capacidade);
            carro.setCombustivel(combustivel);
            carro.setCor(cor);
            carro.setQuilometragem(quilometragem);
            carro.setMarca(marca);
            carro.setModelo(modelo);
            carro.setPlaca(placa);
         
            
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return carro;
    }

*/
}
