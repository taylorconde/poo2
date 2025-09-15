package tech.pinho.poo2.exemplo10.certo;

public class CLTista implements CalculaRecebimento {

    @Override
    public double calculaSalario(Funcionario funcionario) {
        double salario = 0;
        salario = funcionario.getHorasMensaisContratuais() * funcionario.getValorHora();
        salario += (funcionario.getHorasMensaisTrabalhadas() - funcionario.getHorasMensaisContratuais()) * 1.5 * funcionario.getValorHora();
        return salario;
    }
}
