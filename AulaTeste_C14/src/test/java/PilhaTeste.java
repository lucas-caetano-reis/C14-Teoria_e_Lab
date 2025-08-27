// Caso de teste

import org.example.Pilha;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class PilhaTeste {
    @Test //Metadado = dado que descreve dados
    public void testePilhaVazia(){ //Não recebe parâmetros e tem que ser void e pública
        //Contexto do Teste - Fixture
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>(); //Instancia uma pilha de inteiros
        //Execução do método
        boolean vazia = pilhaInteiros.pilhaVazia(); //Testa se a pilha está vazia
        //Verificação
        assertTrue(vazia); //Verifica se o teste passou
    }

    @Test
    public void testePilhaPush() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        boolean vazia = pilhaInteiros.pilhaVazia();
        assertFalse(vazia); //Verifica se um elemento foi inserido na pilha
    }

    @Test
    public void testePilhaPopRetorno(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(10);
        int retorno = pilhaInteiros.pop();
        assertEquals(retorno , 10);
    }

    @Test
    public void testePilhaPopDiminui(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(20);
        pilhaInteiros.pop();
        int tamanho = pilhaInteiros.size();
        assertEquals(tamanho , 0);
    }
}
