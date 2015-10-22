/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tron.camille.monstro.Monstro;

/**
 *
 * @author camille
 */
public class teste {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File arquivo = new File("/home/camille/ModuloDois/src/java/tron/camille/monstro/bancoMonstro");

        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);

        Monstro m = new Monstro();
        ArrayList<Monstro> listaMonstros = new ArrayList<>();

        while (br.ready()) {

            String linha = br.readLine();

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

        fr.close();
        br.close();
    }

}
