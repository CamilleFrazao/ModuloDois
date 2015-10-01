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

        File arquivo = new File("/media/camille/15FB-3121/camille/src/main/java/tron/camille/monstro/bancoMonstro");
        
        Monstro m = new Monstro();

        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("ID: ");
        m.setId(entrada.next());

        System.out.println("NOME: ");
        m.setNome(entrada.next());

        System.out.println("QUANTIDADE: ");
        m.setQuantidade(entrada.nextInt());

        System.out.println("UNIDADE: ");
        m.setUnidade(entrada.nextInt());

        System.out.println("VALOR: ");
        m.setValor(entrada.nextDouble());

        bw.write(m.getId() + ";" + m.getNome() + ";" + m.getQuantidade()
                + ";" + m.getUnidade() + ";" + m.getValor());
        bw.newLine();

        m = new Monstro();

    }

}
