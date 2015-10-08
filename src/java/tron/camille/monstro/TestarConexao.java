/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camille
 */
public class TestarConexao {
    
    public static void main(String[] args) {
        
        try {
            
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monstro", "root", "root");
            
           conexao.prepareStatement("insert into Monstro (id, nome, quantidade, unidade, valor) values (2, \"alo\", 5, 5, 5)").execute();            
            
            
        } catch (Exception ex) {
            
            Logger.getLogger(TestarConexao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
}
