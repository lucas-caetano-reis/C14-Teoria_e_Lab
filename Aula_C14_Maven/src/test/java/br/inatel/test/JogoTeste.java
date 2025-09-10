package br.inatel.test;

import br.inatel.Jogo;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class JogoTeste {
    @Test
    public void testeGetName(){
        Jogo jogo = new Jogo("MGS Delta: Snake Eater", "28/08/2025", "Espionagem", 24);
        String nome = jogo.getNome();
        assertSame("MGS Delta: Snake Eater", nome);
    }
}
