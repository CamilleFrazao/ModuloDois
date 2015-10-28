/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import java.util.Random;

/**
 *
 * @author camille
 */
public class GerarCod {

    public String gerarCod() {
        Random random = new Random();

        int codigo;
        codigo = random.nextInt(99);
        System.out.println(codigo);

        String lol;
        
        lol = Integer.toString(codigo);
        
        System.out.println(lol);
        
        return lol;
    }
}
