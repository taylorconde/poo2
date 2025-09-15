package tech.pinho.poo2.exemplo10.certo;

public class Funcionario {

    private double valorHora;
    private double horasMensaisContratuais;
    private double horasMensaisTrabalhadas;
    private CalculaRecebimento calculaRecebimento;

    public Funcionario(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, CalculaRecebimento calculaRecebimento) {
        this.valorHora = valorHora;
        this.horasMensaisContratuais = horasMensaisContratuais;
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
        this.calculaRecebimento = calculaRecebimento;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasMensaisContratuais() {
        return horasMensaisContratuais;
    }

    public void setHorasMensaisContratuais(double horasMensaisContratuais) {
        this.horasMensaisContratuais = horasMensaisContratuais;
    }

    public double getHorasMensaisTrabalhadas() {
        return horasMensaisTrabalhadas;
    }

    public void setHorasMensaisTrabalhadas(double horasMensaisTrabalhadas) {
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
    }

    public CalculaRecebimento getTipo() {
        return calculaRecebimento;
    }

    public void setTipo(CalculaRecebimento tipo) {
        this.calculaRecebimento = tipo;
    }
}
