package model.bean;

import javax.persistence.*;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome,sobrenome,endereco,cidade,estado,cep,email,senha,grupoId;
    
    public Usuario(String email){
    	this.email = email;
    }
    public Usuario(String nome, String sobrenome, String endereco, String cidade, String estado, String cep, String email, String senha, String grupoId) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.email = email;
        this.senha = senha;
        this.grupoId = grupoId;
    }
    public Usuario(String email, String senha){
    	this.email = email;
    	this.senha = senha;
    }
    public Usuario(){}
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Object getGrupoId() {
        return grupoId;
    }
   
    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }
    
     public String paraJSONString(){
        JsonObjectBuilder construtorJson = Json.createObjectBuilder();
        construtorJson.add("id", this.getId());
        construtorJson.add("nome", this.getNome());
        construtorJson.add("sobrenome", this.getSobrenome());
        construtorJson.add("email", this.getEmail());
        construtorJson.add("senha", this.getSenha());
        construtorJson.add("endereco", this.getEndereco());
        construtorJson.add("cidade", this.getCidade());
        construtorJson.add("estado", this.getEstado());
        construtorJson.add("cep", this.getCep());
        
        JsonObject objetoJson = construtorJson.build();
        
        
        return objetoJson.toString();    
    } 


}
