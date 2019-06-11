package model.bean;

import javax.persistence.*;


import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
/*
   categoria
   ano
   placa
   modelo
   fabricante
   cor  
   estado de conservação
   quilometragem
   tanque de combustível (preenchimento);

 */
@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="status", nullable = false, columnDefinition = "int default 0")
    private int status;
    private String placa,marca,modelo,ano,cor,combustivel,quilometragem,capacidade;

    
    
    public Carro(){}
    public Carro(String placa){
    	this.placa = placa;
    }
    public Carro(String placa, String marca, String modelo, String ano, String cor, String combustivel, String quilometragem, String capacidade) {
       
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.capacidade = capacidade;
    }
   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public int getStatus() {
        return id;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String Quilometragem) {
        this.quilometragem = Quilometragem;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
    
     public String paraJSONString(){
        JsonObjectBuilder construtorJson =  Json.createObjectBuilder();
     
        construtorJson.add("id", this.getId());
        construtorJson.add("status", this.getStatus());
        construtorJson.add("placa", this.getPlaca());
        construtorJson.add("marca", this.getMarca());
        construtorJson.add("modelo", this.getModelo());
        construtorJson.add("ano", this.getAno());
        construtorJson.add("cor", this.getCor());
        construtorJson.add("combustivel", this.getCombustivel());
        construtorJson.add("Quilometragem", this.getQuilometragem());
        construtorJson.add("capacidade", this.getCapacidade());
        
        JsonObject objetoJson = construtorJson.build();
        
        
        return objetoJson.toString();    
    } 


}
