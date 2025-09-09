package tech.pinho.poo2.exemplo7;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("A");
        lista.add("B");
        lista.add(10);

        String elemento = (String) lista.get(0);
        Integer elemento2 = (Integer) lista.get(1);

        System.out.println(elemento);
        System.out.println(elemento2);

    }
}
