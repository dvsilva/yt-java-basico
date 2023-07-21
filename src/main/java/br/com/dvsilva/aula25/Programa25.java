package br.com.dvsilva.aula25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Programa25 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

        LocalDate plusDays = date.plusDays(10);
        System.out.println(plusDays);

        System.out.println("=======================");

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        LocalTime plusHours = time.plusHours(10);
        System.out.println(plusHours);

        System.out.println("=======================");

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getYear());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());

        System.out.println("=======================");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormatted = ldt.format(formatador);
        System.out.println(dateFormatted);
        System.out.println(LocalDate.parse(dateFormatted, formatador));

        System.out.println("=======================");

        int ano = 2024;
        System.out.println(Year.of(ano).isLeap());

        System.out.println("=======================");

        LocalDate data1 = LocalDate.of(2023, Month.JULY, 25);
        LocalDate data2 = LocalDate.of(2023, Month.DECEMBER, 31);
        long diferencaEmDias = ChronoUnit.DAYS.between(data1, data2);
        System.out.println(diferencaEmDias);
    }

}
