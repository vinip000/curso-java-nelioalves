package datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class programa {
    public static void main(String[] args) {
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); //Fuso horário local
        LocalDateTime d02 = LocalDateTime.now(); //Fuso horário local
        Instant d03 = Instant.now();//Fuso horário UTC

        LocalDate d04 = LocalDate.parse("2024-06-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-06-20T15:30:00");
        Instant d06 = Instant.parse("2024-06-20T15:30:00Z");
        Instant d07 = Instant.parse("2024-06-20T15:30:00-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 15:30", fmt2);
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 15, 30);


        System.out.println("");
        System.out.println("Data atual: " + d01);
        System.out.println("Data e hora atual: " + d02);
        System.out.println("Data e hora atual (UTC): " + d03);
        System.out.println("Data de nascimento: " + d04);
        System.out.println("Data e hora de um evento: " + d05);
        System.out.println("Data e hora de um evento (UTC): " + d06);
        System.out.println("Data e hora de um evento (UTC-3): " + d07);
        System.out.println("Data de nascimento (formato personalizado): " + d08);
        System.out.println("Data e hora de um evento (formato personalizado): " + d09);
        System.out.println("Data de nascimento (usando of): " + d10);
        System.out.println("Data e hora de um evento (usando of): " + d11);
    
    }
}
