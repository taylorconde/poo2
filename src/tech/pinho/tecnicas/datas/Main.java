package tech.pinho.tecnicas.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        Date d = new Date(86, 2, 11);
        System.out.println(d);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formato.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo")); // Ex: Fuso horário de São Paulo

        String dataNoFusoBrasil = formato.format(d);
        System.out.println(dataNoFusoBrasil);

        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1);
        System.out.println(cal.getTime());

        LocalDate data = LocalDate.of(2020, 1, 1);
        System.out.println(data);

        LocalTime time = LocalTime.of(23, 59, 59);
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.of(data, time);
        System.out.println(datetime);

    }
}
