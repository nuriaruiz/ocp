package com.nuria.solid.ocp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GeneradorPrimosOrdenDesc implements GeneradorPrimos {

    public List<Integer> primos (int limit) {

        List<Integer> primos = new ArrayList<>();
        for (int i = limit; i >= 2; i--) {
            if (GeneradorPrimos.esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
}
