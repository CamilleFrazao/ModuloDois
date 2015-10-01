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

    @Override //listar
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        File arquivo = new File("/home/camille/ModuloDois/src/java/tron/camille/monstro/bancoMonstro");

        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);

        List<String> id = new ArrayList<>();
        List<String> nome = new ArrayList<>();
        List<String> quant = new ArrayList<>();
        List<String> unid = new ArrayList<>();
        List<String> valor = new ArrayList<>();
//        String[] s;

        while (br.ready()) {

            String linha = br.readLine();

            String []s = linha.split(";");
            
            id.add(s[0]);
            nome.add(s[1]);
            quant.add(s[2]);
            unid.add(s[3]);
            valor.add(s[4]);
        }

        
        for(int i = 0; i < id.size(); i++){
            System.out.println(id.get(i));
        }
        
        req.setAttribute("listaId", id);
        req.setAttribute("listaNome", nome);
        req.setAttribute("listaQuantidade", quant);
        req.setAttribute("listaUnidade", unid);
        req.setAttribute("listaValor", valor);
        
        RequestDispatcher r = req.getRequestDispatcher("listarBuscar.jsp");
        r.forward(req, resp);
        
        fr.close();
        br.close();
        
    }

}
