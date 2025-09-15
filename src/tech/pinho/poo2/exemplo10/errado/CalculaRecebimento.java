package tech.pinho.poo2.exemplo10.errado;

public class CalculaRecebimento {

    public double calculaSalario(Funcionario funcionario) {
        double salario = 0;
        if ("CLT".equals(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisContratuais() * funcionario.getValorHora();
            salario += (funcionario.getHorasMensaisTrabalhadas() - funcionario.getHorasMensaisContratuais()) * 1.5 * funcionario.getValorHora();
        } else if("PJ".equals(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisContratuais() * funcionario.getValorHora();
        } else if("TERCEIRO".equals(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisTrabalhadas() * funcionario.getValorHora();
        } else {
            System.out.println("Funcionário sem cálculo de salário associado");
        }
        return salario;
    }
}
