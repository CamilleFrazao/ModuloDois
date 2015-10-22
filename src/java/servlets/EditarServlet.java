/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import banco.Banco;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tron.camille.monstro.Monstro;

/**
 *
 * @author Camille
 */
@WebServlet(urlPatterns = "/editar")
public class EditarServlet extends HttpServlet {

    Monstro m = new Monstro();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Monstro> monstros = new ArrayList<>();

        try {

            Banco.abrirConexao();

            PreparedStatement x = Banco.abrirConexao().prepareStatement("SELECT * FROM monstro WHERE id = " + req.getParameter("id"));

            ResultSet rs = x.executeQuery();

            while (rs.next()) {

                System.out.println("no while");

                m.setId(rs.getString("id"));
                m.setNome(rs.getString("nome"));
                m.setQuantidade(rs.getInt("quantidade"));
                m.setUnidade(rs.getInt("unidade"));
                m.setValor(rs.getDouble("valor"));

            }

            System.out.println(m.getId());

            req.setAttribute("editar", m);
            req.setAttribute("aff", m.getId());
            RequestDispatcher rd = req.getRequestDispatcher("editar.jsp");
            System.out.println(m.getId());
            rd.forward(req, resp);

            Banco.abrirConexao().commit();
            Banco.abrirConexao().close();

        } catch (Exception ex) {
            
             Logger.getLogger(CadastrarServlet.class.getName()+"não editou").log(Level.SEVERE, null, ex);
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            
            Banco.abrirConexao();

            Banco.abrirConexao().prepareStatement("UPDATE monstro SET id =" + req.getParameter("campoCadastroID") + " , nome=" + " ' " + req.getParameter("campoCadastroNome") + " ' " + ", "
                    + "quantidade =" + req.getParameter("campoCadastroQuantidade") + " , unidade=" + req.getParameter("campoCadastroUnidade") + " ,"
                    + " valor =" + req.getParameter("campoCadastroValor") + " WHERE id = " + m.getId()).execute();

            System.out.println(("UPDATE monstro SET id =" + req.getParameter("campoCadastroID") + " , nome=" + " ' " + req.getParameter("campoCadastroNome") + " ' " + ", "
                    + "quantidade =" + req.getParameter("campoCadastroQuantidade") + " , unidade=" + req.getParameter("campoCadastroUnidade") + " ,"
                    + " valor =" + req.getParameter("campoCadastroValor") + " WHERE id = " + m.getId()));

        } catch (Exception e) {

            System.out.println(("UPDATE monstro SET id =" + req.getParameter("campoCadastroID") + " , nome= " + " ' " + req.getParameter("campoCadastroNome") + " ' " + ", "
                    + "quantidade =" + req.getParameter("campoCadastroQuantidade") + " , unidade=" + req.getParameter("campoCadastroUnidade") + " ,"
                    + " valor =" + req.getParameter("campoCadastroValor") + " WHERE id = " + m.getId()));

            System.out.println("não fez update");

        }

        resp.sendRedirect("listarBuscar");

    }

}
