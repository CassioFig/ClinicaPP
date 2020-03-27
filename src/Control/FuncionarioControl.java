/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.FuncionarioModel;
import Model.FuncionarioDB;

/**
 *
 * @author Usuário
 */
public class FuncionarioControl {
    private FuncionarioModel fm;
    private int matricula;
    private String nome;
    private String endereco;
    private String numero;
    private String cep;
    private String rg;
    private String complemento;
    private String cpf;
    private String sexo;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public FuncionarioModel cadastrar(){
        fm = new FuncionarioModel(matricula, nome, endereco, numero, cep, rg, 
                complemento, cpf, sexo);
        return fm;
    }
    
    public void salvar(){
        FuncionarioDB fdb = new FuncionarioDB();
        fdb.cadastrarFuncionario(fm);
    }
}
