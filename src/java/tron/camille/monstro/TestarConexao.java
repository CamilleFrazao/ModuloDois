/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author camille
 */
public class TestarConexao {

    public static void main(String[] args) {

        try {
            //registrar driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //abrir conexao
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monstro", "root", "root");

            String d = JOptionPane.showInputDialog("id");

            String id = JOptionPane.showInputDialog("id");
            String nome = JOptionPane.showInputDialog("nome");
            int quantidade  =Integer.parseInt( JOptionPane.showInputDialog("quantidade"));
            int unidade  =Integer.parseInt( JOptionPane.showInputDialog("unidade"));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("valor"));

            conexao.prepareStatement("update monstro set id = "+id+", nome = "+nome+", quantidade = "+quantidade+", unidade = "+unidade+", valor = "+valor+" where id =" + d).execute();

            conexao.commit();
            conexao.close();
            
        } catch (Exception ex) {

            Logger.getLogger(TestarConexao.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
