package br.inatel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.inatel.jogos.Jogos;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;

        List<Jogos> jogos = new ArrayList<Jogos>();

        while(flag){
            System.out.println("-------------------------------------------");
            System.out.println("Bem vindo ao terminal de jogos:");
            System.out.println("1 - Adicionar um jogo ao array:");
            System.out.println("2 - Remover um jogo do array:");
            System.out.println("3 - Gerar um arquivo JSON com os dados dos jogos cadastrados:");
            System.out.println("4 - Sair do terminal:");

            int opcao = entrada.nextInt();
            entrada.nextLine();  //Quebra de linha

            switch (opcao){
                case 1:
                    System.out.println("Criando um jogo...");
                    System.out.println("Entre com o nome do jogo:");
                    String nome = entrada.nextLine();
                    System.out.println("Entre com a data de lançamento do jogo:");
                    String dataLancamento = entrada.nextLine();
                    System.out.println("Entre com o gênero do jogo:");
                    String genero = entrada.nextLine();
                    System.out.println("Entre com a duração do jogo");
                    int duracao = entrada.nextInt();

                    jogos.add(new Jogos(nome, dataLancamento, genero, duracao));

                    System.out.println("-------------------------------------------");
                    break;

                case 2:
                    System.out.println("Removendo um jogo...");
                    System.out.println("Entre com o nome do jogo a ser removido:");

                    System.out.println("-------------------------------------------");
                    break;

                case 3:
                    System.out.println("Criando um arquivo JSON...");
                    //gson instanciado com PrettyPrinting()
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();

                    //Criando o JSON a partir da lista de musicas com a dependencia gson
                    String json = gson.toJson(jogos);

                    //Escrevendo o json criado no arquivo musicas.json
                    FileWriter writer;
                    try {
                        writer = new FileWriter("jogos.json");
                        writer.write(json);
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("-------------------------------------------");
                    break;

                case 4:
                    System.out.println("Saindo do terminal...");
                    flag = false;

                    System.out.println("-------------------------------------------");
                    break;
                default:
                    System.out.println("Valor errado. Tente novamente.");

                    System.out.println("-------------------------------------------");
                    break;
            }
        }
    }
}