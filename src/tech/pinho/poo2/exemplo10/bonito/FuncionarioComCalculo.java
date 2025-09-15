package tech.pinho.poo2.exemplo10.bonito;

public class FuncionarioComCalculo extends Funcionario {

    public FuncionarioComCalculo(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, TipoFuncionario tipo) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas, tipo);
    }

    public double calculaSalario() {
        return getTipo().calculaSalario(getHorasMensaisContratuais(), getValorHora(), getHorasMensaisTrabalhadas());
    }
}
