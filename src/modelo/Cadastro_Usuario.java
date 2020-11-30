/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Flaubert
 */
public class Cadastro_Usuario {
    
    //Atributos = Campos da Tabela
    private int codigo;
    private String nome;
    private String sexo;
    private String ocupacao;
    private String familia;
    private String grau_parentesco;
    private String email;
    private String senha;
    private String confirma_senha;
    
    
    //Contrutor Padrão
    public Cadastro_Usuario() {
    
    }

    public Cadastro_Usuario(int codigo, String nome, String sexo, String ocupacao,String familia,
                            String grau_parentesco,String email, String senha,String confirma_senha ) {
        
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.ocupacao = ocupacao;
        this.familia = familia;
        this.grau_parentesco = grau_parentesco;
        this.email = email;
        this.senha = senha;
        this.confirma_senha = confirma_senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
    
    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
    public String getGrau_parentesco() {
        return grau_parentesco;
    }

    public void setGrau_parentesco(String grau_parentesco) {
        this.grau_parentesco = grau_parentesco;
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
    
    public String getConfirma_senha() {
        return confirma_senha;
    }

    public void setConfirma_senha(String confirma_senha) {
        this.confirma_senha = confirma_senha;
    }
   
}
