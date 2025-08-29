import org.example.Fila;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilaTeste {
    @Test
    public void testeFilaVazia(){
        Fila<Integer> filaInteiros = new Fila<Integer>(); //Instanciamento de uma fila de inteiros
        boolean vazia = filaInteiros.filaVazia(); //Verifica se a fila está vazia
        assertTrue(vazia); //Se a fila estiver vazia, o teste passa
    }

    @Test
    public void testeFilaEnfileirar(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.enfileirar(10); //Adiciona um elemento a fila
        boolean vazia = filaInteiros.filaVazia(); //Verifica se há elementos na fila
        assertFalse(vazia); //Se houver, o teste passa
    }

    @Test
    public void testeFilaRemoverRetorno(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.enfileirar(10);
        int retorno = filaInteiros.removerFila(); //Verifica se o elemento foi removido
        assertEquals(10, retorno); //Se o elemento retornado for igual ao inserido, o teste passa
    }

    @Test
    public void testeFilaRemoverDiminui(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.enfileirar(20);
        filaInteiros.removerFila();
        int tamanho = filaInteiros.size(); //Verifica se a fila diminui de tamanho após a remoção de um item
        assertEquals(0, tamanho); // Se a fila ficar vazia, o teste passa
    }

    @Test
    public void testeOrdemFIFO(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.enfileirar(1);
        filaInteiros.enfileirar(2);
        int primeiro = filaInteiros.removerFila(); //Verifica se o primeiro elemento da fila é removido
        assertEquals(1, primeiro);  // Se o valor removido for igual ao primeiro elemento inserido, o teste passa
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testeRemoverFilaVazia() {
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.removerFila(); //Deve lançar uma exceção //Verifica se a exception é lançada ao tentar remover um item de uma fila vazia
    }
}
