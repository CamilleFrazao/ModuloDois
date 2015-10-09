/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author camille
 */
@WebServlet(urlPatterns = "/cadastrar")
public class CadastrarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monstro", "root", "root");

            System.out.println("INSERT INTO Monstro (id , nome, quantidade, unidade, valor) values (" + 
                    req.getParameter("campoCadastroID") + ",\"" + req.getParameter("campoCadastroNome") + "\"," + 
                    req.getParameter("campoCadastroQuantidade") + "," + req.getParameter("campoCadastroUnidade") + "," + 
                    req.getParameter("campoCadastroValor") + ")");
            
            conexao.prepareStatement("INSERT INTO Monstro (id , nome, quantidade, unidade, valor) values "
                    + "(" + req.getParameter("campoCadastroID") + ",\"" + 
                    req.getParameter("campoCadastroNome") + "\"," + req.getParameter("campoCadastroQuantidade") + "," + 
                    req.getParameter("campoCadastroUnidade") + "," + req.getParameter("campoCadastroValor") + ")").execute();
            
            conexao.commit();
            conexao.close();
            
        } catch (Exception ex) {

            System.out.println("não salvou o cadastro");
            Logger.getLogger(CadastrarServlet.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {

        }

        resp.sendRedirect("listarBuscar");

    }

}
