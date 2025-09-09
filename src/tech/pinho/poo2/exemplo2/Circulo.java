package tech.pinho.poo2.exemplo2;

public class Circulo extends Forma implements Desenhavel {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        String circulo = """
                               **************
                            **********************
                         ****************************
                      ***********            ***********
                     ********                    ********
                   ********                        ********
                  *******                            *******
                 *******                              *******
                 ******                                ******
                ******                                  ******
                ******                                  ******
                ******                                  ******
                ******                                  ******
                ******                                  ******
                 ******                                ******
                 *******                              *******
                  *******                            *******
                   ********                        ********
                     ********                    ********
                      ***********            ***********
                         ****************************
                            **********************
                                **************
                """;
        System.out.println(circulo);
    }

    @Override
    double area() {
            return Math.PI * raio * raio;
    }
}
