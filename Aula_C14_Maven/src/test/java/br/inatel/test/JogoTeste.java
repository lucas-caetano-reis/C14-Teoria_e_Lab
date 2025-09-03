package br.inatel.test;

import br.inatel.Jogos;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class JogosTeste {
    @Test
    public void testeGetName(){
        Jogos jogo = new Jogos("MGS Delta: Snake Eater", "28/08/2025", "Espionagem", 24);
        String nome = jogo.getNome();
        assertSame("MGS Delta: Snake Eater", nome);
    }
}
