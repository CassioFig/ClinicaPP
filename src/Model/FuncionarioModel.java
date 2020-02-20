/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuário
 */
public class FuncionarioModel {
    private String nome;
    private String endereco;
    private String numero;
    private String cep;
    private String rg;
    private String complemento;
    private String cpf;

    public FuncionarioModel(String nome, String endereco, String numero, String cep, String rg, String complemento, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
        this.rg = rg;
        this.complemento = complemento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getRg() {
        return rg;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCpf() {
        return cpf;
    }
    
    
    
}
