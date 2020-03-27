/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import Utils.ModuloConexao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cassi_wh5ztk2
 */
public class FolhaPagamentoDB {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public FolhaPagamentoDB() {
        conexao = ModuloConexao.conector();
    }
    
    public ArrayList<FolhaPagamentoModel> listarFolha(){
        ArrayList<FolhaPagamentoModel> fp = new ArrayList();
        FolhaPagamentoModel fpm;
        
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select * from tbfolhapagamento";
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                fpm = new FolhaPagamentoModel(rs.getInt(1), rs.getDouble(2), 
                rs.getDouble(3), rs.getDouble(4), rs.getDouble(5));
                fp.add(fpm);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar consulta!");
        }
        
        return fp;
    }
    
    public void cadastrarSalario(FolhaPagamentoModel fpm){
        String sql = "insert into tbfolhapagamento(matricula, salarioBruto, "
                + "inss, irrf, salarioLiquido) values(?,?,?,?,?)";
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setInt(1, fpm.getMatricula());
            pst.setDouble(2, fpm.getSalarioBruto());
            pst.setDouble(3, fpm.getInss());
            pst.setDouble(4, fpm.getIrrf());
            pst.setDouble(5, fpm.getSalarioLiquido());
           
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com "
                        + "sucesso!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
}
