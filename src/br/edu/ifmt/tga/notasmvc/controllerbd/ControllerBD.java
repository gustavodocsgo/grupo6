package br.edu.ifmt.tga.notasmvc.controllerbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ControllerBD{

    public void conexaoBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/notas_mvc?useSSL=false", "root", "Gmaciel14#");
            JOptionPane.showMessageDialog(null, "Conectou!");

        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar: \n" + erro);
        }
    }

    public void desconecta() {
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Desconectou!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel fechar o banco de dados: "
                    + erro);
        }
    }

    public void querySQL(String sql) {
        try {
            this.stm = conexao.createStatement();
            this.rst = stm.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql,\n" + sqlex + ", \no sql passado foi \n" + sql);
        }
    }

    public void instrucaoSQL(String pstm) {
        try {
            this.pstm = conexao.prepareStatement(pstm);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql,\n" + sqlex + ", \no sql passado foi \n" + pstm);
        }
    }

    public void setPstm(int i, Object o) {
        try {
            pstm.setObject(i, o);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível montar o comando sql,\n" + sqlex + ", \no sql passado foi \n" + pstm);
        }
    }
    
    public PreparedStatement getPstm(){
        return this.pstm;
    }

    public ResultSet getResultSet() {
        return rst;
    }
    
    private Connection conexao;
    private PreparedStatement pstm;
    private Statement stm;
    private ResultSet rst;
}