package tech.pinho.poo2.exemplo10.certo;

public class PessoaJuridica implements CalculaRecebimento {

    @Override
    public double calculaSalario(Funcionario funcionario) {
        return funcionario.getHorasMensaisContratuais() * funcionario.getValorHora();
    }
}
