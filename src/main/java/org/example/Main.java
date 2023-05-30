package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando jogos
        Jogo jogos = new Jogo();
        //variavel para escanear
        Scanner sc = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;

        while(flag){

            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar Jogos!");
            System.out.println("2-Listar Jogos");
            System.out.println("3-Listar Jogos em ordem crescente de preço");
            System.out.println("4-Listar Jogos em ordem decrescente de preço");
            System.out.println("5-Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Nome do Jogo");
                    jogos.setNome(sc.nextLine());
                    System.out.println("Preço do Jogo");
                    jogos.setPreco(sc.nextDouble());
                    try {
                        if (jogos.getPreco() <= 0) {
                            throw new PrecoNegativoException();
                        }
                    }catch(PrecoNegativoException e){
                        break;
                    }
                    sc.nextLine();
                    System.out.println("Gênero do Jogo");
                    jogos.setGenero(sc.nextLine());

                    arq.escrever(jogos);

                    break;

                case 2:
                    //armazena o retorno do metodo de leitura
                    ArrayList <Jogo> jogos1 = arq.ler();


                    for (int i = 0; i < jogos1.size(); i++) {
                        System.out.println("INFORMACOES DO JOGO");
                        System.out.println(jogos1.get(i).getNome());
                        System.out.println(jogos1.get(i).getPreco());
                        System.out.println(jogos1.get(i).getGenero());

                    }
                    break;

                case 3:
                    //armazena o retorno do metodo de leitura
                    ArrayList <Jogo> jogos2 = arq.ler();
                    Collections.sort(jogos2);

                    for (int i = 0; i < jogos2.size(); i++) {
                        System.out.println("INFORMACOES DO JOGO");
                        System.out.println(jogos2.get(i).getNome());
                        System.out.println(jogos2.get(i).getPreco());
                        System.out.println(jogos2.get(i).getGenero());

                    }
                    break;

                case 4:
                    //armazena o retorno do metodo de leitura
                    ArrayList <Jogo> jogos3 = arq.ler();
                    Collections.sort(jogos3);
                    Collections.reverse(jogos3);

                    for (int i = 0; i < jogos3.size(); i++) {
                        System.out.println("INFORMACOES DO JOGO");
                        System.out.println(jogos3.get(i).getNome());
                        System.out.println(jogos3.get(i).getPreco());
                        System.out.println(jogos3.get(i).getGenero());

                    }
                    break;

                case 5:
                    flag =false;
                    break;
            }
        }
    }
}
