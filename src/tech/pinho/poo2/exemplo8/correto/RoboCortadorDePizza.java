package tech.pinho.poo2.exemplo8.correto;

public class RoboCortadorDePizza {

    private ObjetoCortante objetoCortante;

    public RoboCortadorDePizza(ObjetoCortante objetoCortante) {
        this.objetoCortante = objetoCortante;
    }

    public void setObjetoCortante(ObjetoCortante objetoCortante) {
        this.objetoCortante = objetoCortante;
    }

    public void cortar(String sabor) {
        System.out.println("Pegar o cortador de pizza");
        objetoCortante.cortar();
        System.out.println("Servir 6 pedaços de pizza de " + sabor);
    }
}
