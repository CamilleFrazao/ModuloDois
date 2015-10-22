/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import banco.Banco;
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
            
            Banco.abrirConexao();

            String d = JOptionPane.showInputDialog("id");

            String id = JOptionPane.showInputDialog("id");
            String nome = JOptionPane.showInputDialog("nome");
            int quantidade  =Integer.parseInt( JOptionPane.showInputDialog("quantidade"));
            int unidade  =Integer.parseInt( JOptionPane.showInputDialog("unidade"));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("valor"));

            Banco.abrirConexao().prepareStatement("update monstro set id = "+id+", nome = "+nome+", quantidade = "+quantidade+", unidade = "+unidade+", valor = "+valor+" where id =" + d).execute();

            Banco.abrirConexao().commit();
            Banco.abrirConexao().close();
            
        } catch (Exception ex) {

            Logger.getLogger(TestarConexao.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
