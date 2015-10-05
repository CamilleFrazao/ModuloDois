package tron.camille.monstro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonstroMain {

    public static void main(String[] args) throws IOException {

        //BANCO
        File arquivo = new File("/media/camille/15FB-3121/camille/src/main/java/tron/camille/monstro/bancoMonstro");

        //DADO DE ENTRADA
        Scanner entrada = new Scanner(System.in);

        //lista editar e excluir
        List<String> produtos = new ArrayList<String>();

        //INICIALIZAR OBJETO
        Monstro m = new Monstro();

        //VALOR MENU
        System.out.println("\t \t---- MENU ----\n"
                + "1 - INSERIR | \t 2 - LISTAR | \t 3 - BUSCAR |\t 4 - EDITAR |\t 5 - EXCLUIR \n| \t 0 - SAIR");
        int menu = entrada.nextInt();

        do {
            switch (menu) {

                case 1:
                    FileWriter fw = new FileWriter(arquivo, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    System.out.println("ID: ");
                    m.setId(entrada.next());

                    if (m.getId().length() > 2 || m.getId().length() < 2) {
                        do {
                            System.out.println("Id precisa ter dois digitos \n ID: ");
                            m.setId(entrada.next());
                        } while (m.getId().length() > 2 || m.getId().length() < 2);
                    }
                    
                    

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

                    System.out.println("\t \t---- MENU ----\n"
                            + "1 - INSERIR | \t 2 - LISTAR | \t 3 - BUSCAR |\t 4 - EDITAR |\t 5 - EXCLUIR \n| \t 0 - SAIR");
                    menu = entrada.nextInt();

                    bw.close();
                    fw.close();

                    break;

                case 2:
                    //listar
                    FileReader fr = new FileReader(arquivo);
                    BufferedReader br = new BufferedReader(fr);

                    while (br.ready()) {

                        String linha = br.readLine();   
                        
                        
                    }

                    fr.close();
                    br.close();

                    System.out.println("\t \t---- MENU ----\n"
                            + "1 - INSERIR | \t 2 - LISTAR | \t 3 - BUSCAR |\t 4 - EDITAR |\t 5 - EXCLUIR \n| \t 0 - SAIR");
                    ;
                    menu = entrada.nextInt();

                    break;

                case 3:
                    //Buscar
                    FileReader fr2 = new FileReader(arquivo);
                    BufferedReader br2 = new BufferedReader(fr2);

                    System.out.println("Escolha o id para buscar");
                    String id = entrada.next();
                    
                    while (br2.ready()) {
                        String linha = br2.readLine();

                        String idee = linha.substring(0, 2);

                        if (idee.equals(id)) {

                            System.out.println(linha);
                        }

                    }

                    fr2.close();
                    br2.close();

                    System.out.println("\t \t---- MENU ----\n"
                            + "1 - INSERIR | \t 2 - LISTAR | \t 3 - BUSCAR |\t 4 - EDITAR |\t 5 - EXCLUIR \n| \t 0 - SAIR");

                    menu = entrada.nextInt();

                    break;

                case 4:
                    //EDITAR
                    FileReader fr1 = new FileReader(arquivo);
                    BufferedReader br1 = new BufferedReader(fr1);

                    System.out.println("Digite o id que deseja editar:");
                    String editar = entrada.next();

                    while (br1.ready()) {
                        String linha = br1.readLine();
                        produtos.add(linha);

                    }

                    fr1.close();
                    br1.close();

                    for (int i = 0; i < produtos.size(); i++) {

                        String linhaformatada = produtos.get(i).substring(0, 2);

                        if (linhaformatada.equals(editar)) {

                            System.out.println("Produto que vai ser editado: " + produtos.get(i));

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

                            String linha = (m.getId() + ";" + m.getNome() + ";" + m.getQuantidade()
                                    + ";" + m.getUnidade() + ";" + m.getValor());

                            produtos.remove(i);

                            i = -1;

                            produtos.add(linha);

                        }
                    }

                    FileWriter fw3 = new FileWriter(arquivo);
                    BufferedWriter bw3 = new BufferedWriter(fw3);

                    for (int i = 0; i < produtos.size(); i++) {

                        bw3.write(produtos.get(i));
                        bw3.newLine();

                    }
                    
                    bw3.close();
                    fw3.close();                    

                    System.out.println("\t \t---- MENU ----\n"
                            + "1 - INSERIR | \t 2 - LISTAR | \t 3 - BUSCAR |\t 4 - EDITAR |\t 5 - EXCLUIR \n| \t 0 - SAIR");
                    menu = entrada.nextInt();

                    break;

                case 5:
                    //EXCLUIR

                    System.out.println("Qual o id do produto que você deseja excluir: ");
                    String excluir = entrada.next();

                    FileReader fr4 = new FileReader(arquivo);
                    BufferedReader br4 = new BufferedReader(fr4);

                    String linhaformatada = null;

                    while (br4.ready()) {
                        String linha = br4.readLine();

                        produtos.add(linha);
                    }

                    fr4.close();
                    br4.close();

                    for (int i = 0; i < produtos.size(); i++) {

                        linhaformatada = produtos.get(i).substring(0, 2);

                        if (linhaformatada.contains(excluir)) {                          
                            produtos.remove(i);
                            i = -1;
                        }
                    }

                    FileWriter fw5 = new FileWriter(arquivo);
                    BufferedWriter bw5 = new BufferedWriter(fw5);

                    for (int i = 0; i < produtos.size(); i++) {

                        bw5.write(produtos.get(i));
                        bw5.newLine();
                        
                    }

                    fw5.close();
                    bw5.close();

                    System.out.println("\t \t---- MENU ----\n"
                            + "1 - INSERIR | \t 2 - LISTAR | \t 3 - BUSCAR |\t 4 - EDITAR |\t 5 - EXCLUIR \n| \t 0 - SAIR");
                    menu = entrada.nextInt();

                    break;
            }

        } while (menu != 0);
    }

}
