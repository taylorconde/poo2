package tech.pinho.poo2;

import java.io.*;

class Usuario implements Serializable {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Ana", 25);

        // Serializar
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuario.ser"))) {
            out.writeObject(u);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Desserializar
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("usuario.ser"))) {
            Usuario lido = (Usuario) in.readObject();
            System.out.println("Objeto lido: " + lido);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}