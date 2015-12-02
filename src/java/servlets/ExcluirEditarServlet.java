/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import banco.Banco;
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
public class ExcluirEditarServlet extends HttpServlet {

    //excluir
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            Banco.abrirConexao();
            
            Banco.abrirConexao().prepareStatement("DELETE FROM monstro WHERE p_id = "+req.getParameter("id")+"").execute();

            System.out.println("excluido");

            Banco.abrirConexao().close();

            resp.sendRedirect("listarBuscar");

        } catch (Exception e) {
        }

    }

}
