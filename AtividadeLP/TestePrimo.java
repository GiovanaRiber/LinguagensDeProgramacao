package com.atividadelp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream; 

public class TestePrimo {
    
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService pool = Executors.newFixedThreadPool(2);
        
        int QUANTIDADE = 10;
        
        Set<Integer> numerosUnicos = new HashSet<>();
        Random gerador = new Random();

        while (numerosUnicos.size() < QUANTIDADE) {
            numerosUnicos.add(gerador.nextInt(Integer.MAX_VALUE));
        }

        Integer[] v1 = numerosUnicos.toArray(new Integer[0]);
        
        long inicio = System.currentTimeMillis();
        
        int meio = v1.length / 2;
        
        Integer[] primeiraMetade = Arrays.copyOfRange(v1, 0, meio);
        Integer[] segundaMetade = Arrays.copyOfRange(v1, meio, v1.length);
        
        Primo p1 = new Primo(primeiraMetade);
        Primo p2 = new Primo(segundaMetade);
        
        Future<List> futuro = pool.submit(p1);
        Future<List> futuro2 = pool.submit(p2);
        
        List<String> listaJunta = (List<String>) Stream.concat(futuro.get().stream(), futuro2.get().stream())
                                            .collect(java.util.stream.Collectors.toList());
        
        long fim = System.currentTimeMillis();
        
        Integer tam = listaJunta.size();
        
        System.out.println(listaJunta);
        System.out.println("Quantidade de primos: " + tam);
        System.out.println("Tempo decorrido: " + (fim - inicio));
    }
}