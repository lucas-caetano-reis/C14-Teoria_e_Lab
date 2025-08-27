package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T>{
    private List<T> elementos = new ArrayList<T>(); // Armazena elementos
    private int tamanho = 0;

    public int size(){
        return tamanho;
    }

    public boolean pilhaVazia(){ // Verifica se a pilha está vazia
        return(tamanho == 0);
    }

    public void push(T elem) { //Adiciona elementos na pilha
        elementos.add(elem);
        tamanho++;
    }

    public T pop() throws EmptyStackException { // Faz o pop caso hajam elementos na pilha
        if (pilhaVazia())
            throw new EmptyStackException();
        T elem = elementos.remove(tamanho-1);
        tamanho--;
        return elem;
    }
}
