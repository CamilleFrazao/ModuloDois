/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tron.camille.monstro;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author camille
 */
public class Cpf {

    private ArrayList listaAleatoria = new ArrayList();
    private ArrayList listaNumMultiplicados = null;
//Metodo para geracao de um numero aleatorio entre 0 e 9

    public int geraNumAleatorio() {
        //Note que foi preciso fazer um cast para int, ja que Math.random() retorna um double
        Random random = new Random();
        
        int numero1 = random.nextInt();
        int numero = random.nextInt(numero1)*10;       
        
//        int numero = (int) (Math.random() * 10);
        System.out.println("num "+numero);
        return numero;
    }

    //Metodo para geracao de parte do nosso CPF (aqui geramos apenas os 9 primeiros digitos)
    public ArrayList geraCPFParcial() {
        for (int i = 0; i < 9; i++) {
            listaAleatoria.add(geraNumAleatorio());
            System.out.println("lo"+listaAleatoria.add(geraNumAleatorio()));
        }
        return listaAleatoria;
    }

    //Metodo para geracao do primeiro digito verificador (para isso nos baseamos nos 9 digitos aleatorios gerados anteriormente)
    public ArrayList geraPrimeiroDigito() {
        listaNumMultiplicados = new ArrayList();
        int primeiroDigito;
        int totalSomatoria = 0;
        int restoDivisao;
        int peso = 10;
        //Para cada item na lista multiplicamos seu valor pelo seu peso
        for (int item = 0; item < listaAleatoria.size(); item++) {

            listaNumMultiplicados.add(item * peso);
            peso--;
        }
        //Agora somamos todos os itens que foram multiplicados
        for (int item = 0; item < listaNumMultiplicados.size(); item++) {
            totalSomatoria += item;
        }
        restoDivisao = (totalSomatoria % 11);
        //Se o resto da divisao for menor que 2 o primeiro digito sera 0, senao subtraimos o numero 11 pelo resto da divisao
        if (restoDivisao < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - restoDivisao;
        }
        //Apos gerar o primeiro digito o adicionamos a lista
        listaAleatoria.add(primeiroDigito);
        return listaAleatoria;
    }

    //Metodo para geracao do segundo digito verificador (para isso nos baseamos nos 9 digitos aleatorios + o primeiro digito verificador)
    public ArrayList geraSegundoDigito() {
        listaNumMultiplicados = new ArrayList();
        int segundoDigito;
        int totalSomatoria = 0;
        int restoDivisao;
        int peso = 11;
        //Para cada item na lista multiplicamos seu valor pelo seu peso (observe que com o aumento da lista o peso tambem aumenta)
        for (int item = 0; item < listaAleatoria.size(); item++) {
            listaNumMultiplicados.add(item * peso);
            peso--;
        }
        //Agora somamos todos os itens que foram multiplicados
        for (int item = 0; item < listaNumMultiplicados.size(); item++) {
            totalSomatoria += item;
        }
        restoDivisao = (totalSomatoria % 11);
        //Se o resto da divisao for menor que 2 o segundo digito sera 0, senao subtraimos o numero 11 pelo resto da divisao
        if (restoDivisao < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - restoDivisao;
        }
        //Apos gerar o segundo digito o adicionamos a lista
        listaAleatoria.add(segundoDigito);
        return listaAleatoria;
    }

    //Agora que temos nossa lista com todos os digitos que precisamos vamos formatar os valores de acordo com a mascara do CPF
    public String geraCPFFinal() {
        //Primeiro executamos os metodos de geracao
        geraCPFParcial();
        geraPrimeiroDigito();
        geraSegundoDigito();
        String cpf = "";
        String texto = "";
        /*Aqui vamos concatenar todos os valores da lista em uma string.
         Por que isso? Porque a formatacao que o ArrayList gera me impossibilitaria de usar a mascara, pois junto com os numeros gerados ele tambem gera caracteres especias. Ex.: a saída de uma lista de inteiros (de 1 a 5) seria essa:
         [1 , 2 , 3 , 4 , 5]
         Dessa forma o sistema geraria a excecao ParseException*/
        for (int item = 0; item < listaAleatoria.size(); item++) {
            texto += item;
        }
        //Dentro do bloco try.. catch.. tentaremos adicionar uma mascara ao nosso CPF
        try {
            MaskFormatter mf = new MaskFormatter("###.###.###-##");
            mf.setValueContainsLiteralCharacters(false);
            cpf = mf.valueToString(texto);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cpf;
    }
    
    public static void main(String[] args) {
        
//        Cpf c = new Cpf();
//        System.out.println(c.geraCPFFinal());
        
        Random random = new Random();
        
        int numero1 = random.nextInt(10);
//        int numero = numero1*10;       
        
        int numero = (int) (Math.random() * 10);
        
       
        System.out.println("num "+numero+" "+ numero1);
//        return numero;
    }

}