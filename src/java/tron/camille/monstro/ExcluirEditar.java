/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author camille
 */
@WebServlet(urlPatterns = "/excluirEditar")
public class ExcluirEditar extends HttpServlet {

    //excluir
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            //driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //abrir conexao
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_monstro","root","root");
            
            //sql
            PreparedStatement sql = con.prepareStatement("");
            
        } catch (Exception e) {
        }

    }

}
