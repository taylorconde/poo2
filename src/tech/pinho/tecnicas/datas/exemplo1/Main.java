package tech.pinho.tecnicas.datas.exemplo1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date hoje = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(hoje);
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(cal.getTime());

        LocalDate hoje2 = LocalDate.now();
        LocalDate futuro = hoje2.plusDays(5);
        System.out.println(futuro);
    }
}
