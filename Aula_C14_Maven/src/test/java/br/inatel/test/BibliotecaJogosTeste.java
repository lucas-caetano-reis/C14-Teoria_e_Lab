package br.inatel.test;

import br.inatel.Jogo;
import br.inatel.BibliotecaJogos;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaJogosTeste {
    @Test
    public void testeBibliotecaAdicionar(){
        BibliotecaJogos bibliotecaJogos = new BibliotecaJogos();
        bibliotecaJogos.adicionarJogo(new Jogo("Teste","Teste","Teste", 1));
        int tamanho = bibliotecaJogos.getTamanhoJogos();
        assertEquals(1, tamanho);
    }

    @Test
    public void testeBibliotecaRemover(){
        BibliotecaJogos bibliotecaJogos = new BibliotecaJogos();
        bibliotecaJogos.adicionarJogo(new Jogo("Teste", "Teste", "Teste", 0));
        bibliotecaJogos.removerJogo("Teste");
        int tamanho = bibliotecaJogos.getTamanhoJogos();
        assertEquals(0, tamanho);
    }
}
