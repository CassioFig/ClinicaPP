/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.FuncionarioModel;
import Utils.BancoDeDados;
import com.google.gson.Gson;

/**
 *
 * @author Usuário
 */
public class FuncionarioControl {
    FuncionarioModel fm;
    private String nome;
    private String endereco;
    private String numero;
    private String cep;
    private String rg;
    private String complemento;
    private String cpf;

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
    
    public FuncionarioModel cadastrar(){
        fm = new FuncionarioModel(nome, endereco, numero, cep, rg, complemento, cpf);
        return fm;
    }
    
    public void salvar(){
        Gson gson = new Gson();
        String json = gson.toJson(fm);
        BancoDeDados.escreverArquivo(json, "cadastroFuncionario.txt");
    }
}
