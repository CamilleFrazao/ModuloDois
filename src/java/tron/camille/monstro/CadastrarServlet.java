/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

        File arquivo = new File("/home/camille/ModuloDois/src/java/tron/camille/monstro/bancoMonstro");

        Monstro m = new Monstro();

        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);

        m.setId(req.getParameter("campoCadastroID"));

        m.setNome(req.getParameter("campoCadastroNome"));

        m.setQuantidade(Integer.parseInt(req.getParameter("campoCadastroQuantidade")));

        m.setUnidade(Integer.parseInt(req.getParameter("campoCadastroUnidade")));

        m.setValor(Double.parseDouble(req.getParameter("campoCadastroValor")));

        bw.write(m.getId() + ";" + m.getNome() + ";" + m.getQuantidade()
                + ";" + m.getUnidade() + ";" + m.getValor());
        bw.newLine();

        m = new Monstro();
        
        bw.close();
        fw.close();
        
        resp.sendRedirect("menu.jsp");
        
        
        
    }

}
