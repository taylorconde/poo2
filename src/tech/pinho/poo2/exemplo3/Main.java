package tech.pinho.poo2.exemplo3;

public class Main {

    public static void main(String[] args) {
        ObjetoMarcado objetoMarcado = new ObjetoMarcado();
        if (objetoMarcado instanceof Marcacao) {
            System.out.println("Marcacao");
        }
    }
}
