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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tron.camille.monstro.Monstro;

/**
 *
 * @author camille
 */
@WebServlet(urlPatterns = "/listarBuscar")
public class ListarBuscarServlet extends HttpServlet {

    Monstro m;

    ArrayList<Monstro> listaMonstros;

    @Override//buscar
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getParameter("campoBuscar");
        
        List<Monstro> monstros = new ArrayList<>();

        try {
            
            Banco.abrirConexao();

            PreparedStatement sql = Banco.abrirConexao().prepareStatement("SELECT * FROM monstro where nome =" + "\"" +req.getParameter("campoBuscar") +"\"" +"");

            //executeQuery
            ResultSet rs = sql.executeQuery();

            while (rs.next()) {
                
                Monstro m = new Monstro();
                m.setId(rs.getString("p_id"));
                m.setNome(rs.getString("nome"));
                m.setQuantidade(rs.getInt("quantidade"));
                m.setUnidade(rs.getInt("unidade"));
                m.setValor(rs.getDouble("valor"));
                
                monstros.add(m);          
                            
            }

        } catch (Exception e) {
            
            System.out.println("não foi possivel buscar");
            
        }

        req.setAttribute("listar", monstros);
        RequestDispatcher rd = req.getRequestDispatcher("listarBuscar.jsp");
        rd.forward(req, resp);

    }

    @Override //listar
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            Banco.abrirConexao();
            
            PreparedStatement sql = Banco.abrirConexao().prepareStatement("SELECT * FROM monstro");

            ResultSet rs = sql.executeQuery();

            List<Monstro> monstros = new ArrayList<>();

            while (rs.next()) {

                Monstro m = new Monstro();

                m.setId(rs.getString("p_id"));
                m.setNome(rs.getString("nome"));
                m.setQuantidade(rs.getInt("quantidade"));
                m.setUnidade(rs.getInt("unidade"));
                m.setValor(rs.getDouble("valor"));

                monstros.add(m);

            }

            req.setAttribute("listar", monstros);
            RequestDispatcher r = req.getRequestDispatcher("listarBuscar.jsp");
            r.forward(req, resp);

            rs.close();

        } catch (Exception e) {

            System.out.println("não foi possivel listar");
        }

    }

}
