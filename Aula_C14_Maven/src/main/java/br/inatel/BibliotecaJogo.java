package br.inatel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public class BibliotecaJogo {
    private List<Jogo> jogos = new ArrayList<>();

    public int obterTamanho(){
        return jogos.size();
    }

    public boolean listaVazia(){
        return jogos.isEmpty();
    }

    public void adicionarJogo(Jogo jogo){
        jogos.add(jogo);
    }

    public void removerJogo(String nome){
        if (listaVazia()){
            throw new IllegalStateException("A lista está vazia. Não é possível remover nenhum jogo.");
        }

        boolean removido = jogos.removeIf(jogo -> jogo.getNome().equalsIgnoreCase(nome));
        if (!removido) {
            throw new NoSuchElementException("O jogo '" + nome + "' não foi encontrado na lista.");
        }
    }

    public List<Jogo> listarJogos() {
        return jogos;
    }

    public String exportarParaJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(jogos);
    }

    public void importarDeJson(String caminhoArquivo) {
        Gson gson = new Gson();
        Type tipoLista = new TypeToken<List<Jogo>>() {}.getType();

        try (FileReader reader = new FileReader(caminhoArquivo)) {
            List<Jogo> jogosImportados = gson.fromJson(reader, tipoLista);
            if (jogosImportados != null) {
                this.jogos = jogosImportados;
            }
        } catch (IOException e) {
            System.out.println("Não foi possível carregar os jogos do arquivo: " + caminhoArquivo);
        }
    }
}
