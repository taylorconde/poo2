package tech.pinho.poo2.exemplo10.bonito;

public enum TipoFuncionario implements CalculaRecebimento{

    CLT {
        @Override
        public double calculaSalario(double horasMensaisContratuais, double valorHora, double horasMensaisTrabalhadas) {
            double salario = 0;
            salario = horasMensaisContratuais * valorHora;
            salario += (horasMensaisTrabalhadas - horasMensaisContratuais) * 1.5 * valorHora;
            return salario;
        }
    },
    PJ {
        @Override
        public double calculaSalario(double horasMensaisContratuais, double valorHora, double horasMensaisTrabalhadas) {
            double salario = 0;
            salario = horasMensaisTrabalhadas * valorHora;
            return salario;
        }
    },
    TERCEIRIZADO {
        @Override
        public double calculaSalario(double horasMensaisContratuais, double valorHora, double horasMensaisTrabalhadas) {
            double salario = 0;
            salario = horasMensaisContratuais * valorHora;
            return salario;
        }
    };

}
