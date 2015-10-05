/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import com.sun.faces.util.MostlySingletonSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

    File arquivo = new File("/home/camille/ModuloDois/src/java/tron/camille/monstro/bancoMonstro");

    FileReader fr2;
    BufferedReader br2;

    Monstro m;

    ArrayList<Monstro> listaMonstros;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //buscar        
        fr2 = new FileReader(arquivo);
        br2 = new BufferedReader(fr2);

        req.getParameter("campoBuscar");

        listaMonstros = new ArrayList<>();

        while (br2.ready()) {
            String linha = br2.readLine();

            String[] s = linha.split(";");

            m = new Monstro();

            m.setId(s[0]);
            m.setNome(s[1]);
            m.setQuantidade(Integer.parseInt(s[2]));
            m.setUnidade(Integer.parseInt(s[3]));
            m.setValor(Double.parseDouble(s[4]));

            listaMonstros.add(m);
        }

        for (int i = 0; i < listaMonstros.size(); i++) {
            if (listaMonstros.get(i).getId().equals(req.getParameter("campoBuscar"))) {
                m = new Monstro();
                m = listaMonstros.get(i);
            }
        }

        req.setAttribute("busca", m);
        RequestDispatcher rd = req.getRequestDispatcher("listarBuscar.jsp");
        rd.forward(req, resp);

        fr2.close();
        br2.close();

    }

    @Override //listar
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        FileReader fr2 = new FileReader(arquivo);
        BufferedReader br2 = new BufferedReader(fr2);

        m = new Monstro();

        listaMonstros = new ArrayList<>();

        while (br2.ready()) {

            String linha = br2.readLine();

            String[] s = linha.split(";");

            m = new Monstro();

            m.setId(s[0]);
            m.setNome(s[1]);
            m.setQuantidade(Integer.parseInt(s[2]));
            m.setUnidade(Integer.parseInt(s[3]));
            m.setValor(Double.parseDouble(s[4]));

            listaMonstros.add(m);

        }

        for (int i = 0; i < listaMonstros.size(); i++) {

            System.out.println(listaMonstros.get(i).getId());

        }

        req.setAttribute("listaM", listaMonstros);
        RequestDispatcher r = req.getRequestDispatcher("listarBuscar.jsp");
        r.forward(req, resp);

        fr2.close();
        br2.close();

    }

}
