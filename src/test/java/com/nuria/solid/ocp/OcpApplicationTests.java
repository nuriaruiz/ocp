package com.nuria.solid.ocp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OcpApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void test_orden_natural() {

        GeneradorPrimos generador = new GeneradorPrimosOrdenAsc();
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13);

        Assert.assertEquals(generador.primos(15), expected);
    }

    @Test
    public void test_orden_inverso() {

        GeneradorPrimos generador = new GeneradorPrimosOrdenDesc();
        List<Integer> expected = Arrays.asList(13, 11, 7, 5, 3, 2);

        Assert.assertEquals(generador.primos(15), expected);
    }

}
