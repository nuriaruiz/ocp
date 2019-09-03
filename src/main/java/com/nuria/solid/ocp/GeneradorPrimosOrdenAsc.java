package com.nuria.solid.ocp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GeneradorPrimosOrdenAsc implements GeneradorPrimos {

    public GeneradorPrimosOrdenAsc() { }

    public List<Integer> primos (int limit) {

        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (GeneradorPrimos.esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
}
