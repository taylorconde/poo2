package tech.pinho.poo2.exemplo5;

import java.io.Serializable;
import java.time.Instant;
import java.util.*;

public class Main implements Serializable {

    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        calculaTempo(valores);
    }
    static void calculaTempo(ArrayList<Integer> valores) {
        Instant instant = Instant.now();
        for (int i = 0; i < 10000000; i++) {
            valores.add(0, i);
        }

        System.out.println("Gastamos " + (Instant.now().toEpochMilli() - instant.toEpochMilli()));

    }
}
