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
    private final int matricula;
    private final String nome;
    private final String endereco;
    private final String numero;
    private final String cep;
    private final String rg;
    private final String complemento;
    private final String cpf;
    private final String sexo;

    public FuncionarioModel(int matricula, String nome, String endereco, 
            String numero, String cep, String rg, String complemento, 
            String cpf, String sexo) {
        
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
        this.rg = rg;
        this.complemento = complemento;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getMatricula() {
        return matricula;
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

    public String getSexo() {
        return sexo;
    }
  
    
}
