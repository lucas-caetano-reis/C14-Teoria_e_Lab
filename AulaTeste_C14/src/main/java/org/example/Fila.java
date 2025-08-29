package org.example;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Fila<T> {
    private Queue<T> elementos = new LinkedList<T>(); //Fila que armazena elementos

    public int size() { //Retorna o tamanho da fila
        return elementos.size();
    }

    public boolean filaVazia() { //Verifica se a fila está vazia
        return (elementos.isEmpty());
    }

    public void enfileirar(T elem){ //Adiciona um elemento no final da fila
        elementos.add(elem);
    }

    public T removerFila(){ //Remove o primeiro elemento da fila e lança uma exception caso ela esteja vazia
        if (filaVazia())
            throw new NoSuchElementException("A fila está vazia.");
        return elementos.poll();
    }
}
