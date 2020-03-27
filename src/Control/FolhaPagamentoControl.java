/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.FolhaPagamentoModel;
import Model.FolhaPagamentoDB;

/**
 *
 * @author Usuário
 */
public class FolhaPagamentoControl {
    private FolhaPagamentoModel fpm;
    private int matricula;
    private double salarioBruto;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public FolhaPagamentoModel calcularSalario(){
        fpm = new FolhaPagamentoModel(matricula, salarioBruto);
        return fpm;
    }
    
    public void cadastrarSalario(){
        FolhaPagamentoDB fpdb = new FolhaPagamentoDB();
        fpdb.cadastrarSalario(fpm);
    }
    
}
