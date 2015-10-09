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

/**
 *
 * @author camille
 */
public class TestarConexao {

    public static void main(String[] args) {

        try {

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monstro", "root", "root");
            PreparedStatement x = conexao.prepareStatement("SELECT * FROM Monstro WHERE id = 45");

            ResultSet rs = x.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getString("id") + ":" + rs.getString("nome") + ":" + rs.getInt("quantidade") + ":" + rs.getInt("unidade") + ":" + rs.getDouble("valor"));

//                Monstro m = new Monstro();
//                
//                m.setId(rs.getString("id"));
//                m.setNome(rs.getString("nome"));
//                m.setQuantidade(rs.getInt("quantidade"));
//                m.setUnidade(rs.getInt("unidade"));
//                m.setValor(rs.getDouble("valor"));
//                
//                System.out.println(m.getId()+":"+m.getNome()+":"+m.getQuantidade()+":"+m.getUnidade()+":"+m.getValor());
            }

            conexao.close();

        } catch (Exception ex) {

            Logger.getLogger(TestarConexao.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
