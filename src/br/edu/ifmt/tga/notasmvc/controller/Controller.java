package br.edu.ifmt.tga.notasmvc.controller;
    
import br.edu.ifmt.tga.notasmvc.controllerbd.ControllerBD;
import java.util.ArrayList;
import java.util.List;
import br.edu.ifmt.tga.notasmvc.model.Model;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


    public class Controller{
    
        Model m;
        
    public Controller(Model aM){
        m = aM;
    }

    public void enviar1(String v1, int oper){        
        double valor1 = Double.parseDouble(v1);
        m.setValor1(valor1, oper);
    }
    
    public void enviar2(String v2) {        
        double valor2 = Double.parseDouble(v2);
        
        m.setValor2(valor2);
    }
    
    public float calculaMA(Model m){
        m.setMediaA();
        float media = m.getMediaA();
        return media;
    }

    public int gravaMA(Model m){
        
        calculaMA(m);
        lm.add(m);
        System.out.println("Dados gravados da Media Anual:" + 
                "\n\tIndíce: " + (lm.size() - 1) +
                "\n\tDisciplina: " + lm.get(lm.size() - 1).getDiscA() + 
                "\n\tMédia 1º Bim: " + lm.get(lm.size() - 1).getBim1() +
                "\n\tMédia 2º Bim: " + lm.get(lm.size() - 1).getBim2() +
                "\n\tMédia 3º Bim: " + lm.get(lm.size() - 1).getBim3() +
                "\n\tMédia 4º Bim: " + lm.get(lm.size() - 1).getBim4() +
                "\n\tMédia Final: " + lm.get(lm.size() - 1).getMediaA());
        
        int id = 0;
        calculaMA(m);
        con = new ControllerBD();
        con.conexaoBD();
        con.instrucaoSQL("INSERT INTO media_anual(disc, nota1, nota2, nota3, nota4, mediaanual) "
                + "VALUES (?,?,?,?,?,?)");
        con.setPstm(1, m.getDiscA());
        con.setPstm(2, m.getBim1());
        con.setPstm(3, m.getBim2());
        con.setPstm(4, m.getBim3());
        con.setPstm(5, m.getBim4());
        con.setPstm(6, m.getMediaA());
        try {
            con.getPstm().execute();
            JOptionPane.showMessageDialog(null, "Notas gravadas com sucesso!");
            
            con.querySQL("SELECT MAX(id) FROM media_anual");
            if (con.getResultSet().next()) {
                id = con.getResultSet().getInt("MAX(id)");
            }
            con.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao tentar gravar!\n" + ex, 1);
        }
        return id;      
        
    }

    public void imprimeListaMA() {
        System.out.println("Dados constantes da lista:");
        int c = 0;
        while (c < lm.size()) {
            System.out.println("Indíce: " + c
                    + "\tDisciplina: " + lm.get(c).getDiscA()
                    + "\tMédia 1º Bim: " + lm.get(c).getBim1()
                    + "\tMédia 2º Bim: " + lm.get(c).getBim2()
                    + "\tMédia 3º Bim: " + lm.get(c).getBim3()
                    + "\tMédia 4º Bim: " + lm.get(c).getBim4()
                    + "\tMédia Final: " + lm.get(c).getMediaA()
            );
            c++;
        }
    }
    
    public float calculaMB(Model m){
        m.setMediaB();
        float mediaB = m.getMediaB();
        return mediaB;
    }

    public void gravaMB(Model m){
        calculaMB(m);
        lm.add(m);
        System.out.println("Dados gravados da Media Anual:" + 
                "\n\tIndíce: " + (lm.size() - 1) +
                "\n\tDisciplina: " + lm.get(lm.size() - 1).getDiscB() + 
                "\n\tNota Mensal: " + lm.get(lm.size() - 1).getMensal() +
                "\n\tNota Bimestral: " + lm.get(lm.size() - 1).getBim() +
                "\n\tNota Atitudinal: " + lm.get(lm.size() - 1).getAtt() +
                "\n\tMédia Bimestral: " + lm.get(lm.size() - 1).getMediaB());
    }

    public void imprimeListaMB() {
        System.out.println("Dados constantes da lista:");
        int c = 0;
        while (c < lm.size()) {
            System.out.println("Indíce: " + c
                    + "\tDisciplina: " + lm.get(c).getDiscB()
                    + "\tNota Mensal: " + lm.get(c).getMensal()
                    + "\tNota Bimestral: " + lm.get(c).getBim()
                    + "\tNota Atitudinal: " + lm.get(c).getAtt()
                    + "\tMédia do Bimestral: " + lm.get(c).getMediaB()
            );
            c++;
        }
        
    }

    private final List<Model> lm = new ArrayList();
    private ControllerBD con = null;
        
}
