/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import banco.Banco;
import java.io.IOException;
import java.sql.SQLException;
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

        Banco.abrirConexao();
        
        if (req.getParameter("campoCadastroNome").length() > 100 || req.getParameter("campoCadastroQuantidade").length() > 10
                || req.getParameter("campoCadastroUnidade").length() > 10 || req.getParameter("campoCadastroValor").length()>22) {
            System.out.println("deu merda, nome/quantidade/unidade/valor muito grande");

            try {
                Banco.abrirConexao().close();
            } catch (SQLException ex) {
                Logger.getLogger(CadastrarServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {

                System.out.println("INSERT INTO produto (nome, quantidade, unidade, valor) values (" + "\"" + req.getParameter("campoCadastroNome") + "\","
                        + req.getParameter("campoCadastroQuantidade") + "," + req.getParameter("campoCadastroUnidade") + ","
                        + req.getParameter("campoCadastroValor") + ")");

                Banco.abrirConexao().prepareStatement("INSERT INTO produto (nome, quantidade, unidade, valor) values (" + "\"" + req.getParameter("campoCadastroNome") + "\","
                        + req.getParameter("campoCadastroQuantidade") + "," + req.getParameter("campoCadastroUnidade") + ","
                        + req.getParameter("campoCadastroValor") + ")").execute();

//            Banco.abrirConexao().commit();
                Banco.abrirConexao().close();

            } catch (Exception ex) {

                Logger.getLogger(CadastrarServlet.class.getName() + "não salvou o cadastro").log(Level.SEVERE, null, ex);

            } finally {

            }

        }

        resp.sendRedirect("listarBuscar");

    }

}
