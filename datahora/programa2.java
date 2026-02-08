package datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.sql.Date;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class programa2 {

    public static void main(String[] args) {
        
        LocalDate d01 = LocalDate.parse("2025-02-08"); //Fuso horário local
        LocalDateTime d02 = LocalDateTime.parse("2025-05-09T01:30:26"); //Fuso horário local
        Instant d03 = Instant.parse("2025-05-09T01:30:26Z");//Fuso horário UTC

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(" ");
        System.out.println("Data: " + d01.format(fmt1));
        //System.out.println("Data : " + fmt1.format(d01));
        //System.out.println("Data: " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //System.out.println("Data e hora: " + d02.format(fmt1));
        System.out.println("Data e hora: " + d02.format(fmt2));
        System.out.println("Data e hora (UTC): " + fmt3.format(d03)); //Ajusta o fuso horário para o local do sistema antes de formatar a data e hora UTC
        System.out.println("Data e hora (UTC): " + fmt4.format(d02)); //Formata a data e hora UTC usando o formato ISO 8601
        System.out.println("Data e hora (UTC): " + fmt5.format(d03)); //Formata a data e hora UTC usando o formato ISO 8601 para instantes


    
    }
    
}
