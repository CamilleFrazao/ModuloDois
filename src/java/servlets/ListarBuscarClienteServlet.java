/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tron.camille.monstro.Cliente;

/**
 *
 * @author camille
 */
@WebServlet (urlPatterns = "/listarBuscarCliente")
public class ListarBuscarClienteServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        banco.Banco.abrirConexao();
        
        try {
            
            PreparedStatement sql = banco.Banco.abrirConexao().prepareStatement("SELECT * FROM cliente");
            
            ResultSet rs = sql.executeQuery();
            
            List<Cliente> clientes = new ArrayList<>();
            
            while(rs.next()){
                
                Cliente c = new Cliente();
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ListarBuscarClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    
    
}
