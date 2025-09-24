package tech.pinho.tecnicas.datas.exemplo2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();

        LocalDate natal = LocalDate.of(dataAtual.getYear(), Month.DECEMBER, 25);

        LocalDate anoNovo = LocalDate.of(dataAtual.getYear() + 1, Month.JANUARY, 1);

        if (dataAtual.isAfter(natal)) {
            natal = LocalDate.of(dataAtual.getYear() + 1, Month.DECEMBER, 25);
        }

        long diasAteNatal = ChronoUnit.DAYS.between(dataAtual, natal);

        if (dataAtual.isBefore(natal)) {
            System.out.println("A data atual é antes do Natal. Faltam " + diasAteNatal + " dias para o Natal!");
        } else if (dataAtual.equals(natal)) {
            System.out.println("Hoje é Natal! Ebbbbbbbbbbbaaaaaaaaaaaaaa");
        } else if (dataAtual.isBefore(anoNovo)) {
            System.out.println("A data atual é entre o Natal e o Ano Novo. Faltam " + ChronoUnit.DAYS.between(dataAtual, anoNovo) + " dias para o Ano Novo!");
        } else if (dataAtual.equals(anoNovo)) {
            System.out.println("Hoje é Ano Novo! Bora beber cair levantar ");
        } else {
            System.out.println("A data atual é após o Ano Novo, você tem 365 de oportunidades ");
        }

        if (diasAteNatal > 0) {
            System.out.println("Faltam " + diasAteNatal + " dias para o Natal!");
        } else if (diasAteNatal < 0) {
            System.out.println("O Natal já passou há " + Math.abs(diasAteNatal) + " dias!");
        }
    }
}
