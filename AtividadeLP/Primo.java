package com.atividadelp;

import java.util.concurrent.Callable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;  

public class Primo implements Callable<List> {

    private Integer[] vetor;

    public Primo(Integer v[]) {
        vetor = v;
    }

    private boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;

        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    @Override
    public List<Integer> call() {
        return Arrays.stream(vetor)
                     .filter(this::ehPrimo)
                     .collect(Collectors.toList());
    }
}