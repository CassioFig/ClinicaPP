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
public class FuncionarioDB {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public FuncionarioDB() {
        conexao = ModuloConexao.conector();
        
    }
    
    public ArrayList<FuncionarioModel> listarFuncionarios(){
        ArrayList<FuncionarioModel> fl = new ArrayList();
        FuncionarioModel fm;
        
        try {
            Statement stmt = conexao.createStatement();
            String sql = "select * from tbfuncionario";
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                fm = new FuncionarioModel(rs.getInt(1), rs.getString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5), 
                        rs.getString(6), rs.getString(7), rs.getString(8), 
                        rs.getString(9));
                fl.add(fm);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar consulta!");
        }
        
        return fl;
    }
    
    public void cadastrarFuncionario(FuncionarioModel fm){
        String sql = "insert into tbfuncionario(matricula, nome, endereco, "
                + "numero, cep, rg, complemento, cpf, sexo) "
                + "values(?,?,?,?,?,?,?,?,?)";
        
        
        try {
            pst = conexao.prepareStatement(sql);
            
            pst.setInt(1, fm.getMatricula());
            pst.setString(2, fm.getNome());
            pst.setString(3, fm.getEndereco());
            pst.setString(4, fm.getNumero());
            pst.setString(5, fm.getCep());
            pst.setString(6, fm.getRg());
            pst.setString(7, fm.getComplemento());
            pst.setString(8, fm.getCpf());
            pst.setString(9, fm.getSexo());
            
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
