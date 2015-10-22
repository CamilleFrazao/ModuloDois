/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camille
 */
public class Banco {
        
    public static Connection abrirConexao() {
        
        try {
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());            
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monstro", "root", "root");
            return conexao;
            
        } catch (Exception ex) {
            
            Logger.getLogger(Banco.class.getName()+"Não conectou com o banco").log(Level.SEVERE, null, ex);
            
        }
        
        return null;
        
    }
        
}
