package tech.pinho.poo2.exemplo10.certo;

public class Terceirizado implements CalculaRecebimento {

    @Override
    public double calculaSalario(Funcionario funcionario) {
        return funcionario.getHorasMensaisTrabalhadas() * funcionario.getValorHora();
    }
}
