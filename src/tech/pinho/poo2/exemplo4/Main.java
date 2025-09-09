package tech.pinho.poo2.exemplo4;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Usuario u = new Usuario("Ana", 25);
        Usuario u2 = new Usuario("Bruno", 39);

        // Serializar
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuario.ser"))) {
            out.writeObject(u);
            out.writeObject(u2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Desserializar
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("usuario.ser"))) {
            Usuario lido = (Usuario) in.readObject();
            System.out.println("Objeto lido: " + lido);
            lido = (Usuario) in.readObject();
            System.out.println("Objeto lido: " + lido);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
