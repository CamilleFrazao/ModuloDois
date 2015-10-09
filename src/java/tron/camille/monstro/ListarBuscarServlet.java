/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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

            //registar driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //abrir conexao
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monstro", "root", "root");

            //sql
            PreparedStatement sql = con.prepareStatement("SELECT * FROM Monstro where id =" + req.getParameter("campoBuscar") + "");

            //executeQuery
            ResultSet rs = sql.executeQuery();

            while (rs.next()) {
                
                Monstro m = new Monstro();
                
                m.setId(rs.getString("id"));
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
            //driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //abrir conexao
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monstro", "root", "root");

            PreparedStatement sql = con.prepareStatement("SELECT * FROM Monstro");

            ResultSet rs = sql.executeQuery();

            List<Monstro> monstros = new ArrayList<>();

            while (rs.next()) {

                Monstro m = new Monstro();

                m.setId(rs.getString("id"));
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
