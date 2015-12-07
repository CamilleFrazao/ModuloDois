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
@WebServlet(urlPatterns = "/cadastrarCliente")
public class CadastrarClienteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Banco.abrirConexao();

        try {

            Banco.abrirConexao().prepareStatement("insert into db_monstro.cliente (nome, nascimento, cpf, email, telefone)"
                    + " values ('" + req.getParameter("campoCadastroNomeCliente") + "',"
                    + " '" + req.getParameter("campoCadastroNascimentoCliente") + "', "
                    + "'" + req.getParameter("campoCadastroCpfCliente") + "', "
                    + "'" + req.getParameter("campoCadastroEmailCliente") + "', "
                    + "'" + req.getParameter("campoCadastroTelefoneCliente") + "')").execute();

            System.out.println("insert into db_monstro.cliente (nome, nascimento, cpf, email, telefone)"
                    + " values ('" + req.getParameter("campoCadastroNomeCliente") + "',"
                    + " '" + req.getParameter("campoCadastroNascimentoCliente") + "', "
                    + "'" + req.getParameter("campoCadastroCpfCliente") + "', "
                    + "'" + req.getParameter("campoCadastroEmailCliente") + "', "
                    + "'" + req.getParameter("campoCadastroTelefoneCliente") + "')");

            Banco.abrirConexao().close();

        } catch (SQLException ex) {
            
            Logger.getLogger(CadastrarServlet.class.getName() + "não salvou o cadastro de cliente").log(Level.SEVERE, null, ex);

        }

        resp.sendRedirect("listarBuscarCliente");

    }

}
