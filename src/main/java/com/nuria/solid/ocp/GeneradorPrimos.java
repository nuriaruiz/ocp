package com.nuria.solid.ocp;

import org.springframework.stereotype.Component;

import java.util.List;

public interface GeneradorPrimos {

    abstract List<Integer> primos (int limit);

    static boolean esPrimo(int candidato) {
        for (int i = 2; i < candidato; i++) {
            if (candidato % i == 0) {
                return false;
            }
        }

        return true;
    }
}
