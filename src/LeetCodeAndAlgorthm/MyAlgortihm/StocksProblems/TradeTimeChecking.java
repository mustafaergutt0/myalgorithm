package LeetCodeAndAlgorthm.MyAlgortihm.StocksProblems;

import java.sql.Time;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TimerTask;

public class TradeTimeChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan başlangıç ve bitiş saatlerini alın
        System.out.print("Başlangıç saati (örneğin, 10:00): ");
        String startInput = scanner.nextLine();
        System.out.print("Bitiş saati (örneğin, 18:00): ");
        String endInput = scanner.nextLine();

        // Saat formatı
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime startTime = LocalTime.parse("10:00", timeFormatter);
        LocalTime endTime = LocalTime.parse("18:00", timeFormatter);

        // Zamanları listeleyin
        System.out.println("Trade Zamanları:");
        LocalTime currentTime = startTime;

        while (!currentTime.isAfter(endTime)) {
            System.out.println(currentTime.format(timeFormatter));
            currentTime = currentTime.plusMinutes(1);
        }

        scanner.close();
    }


    }



    // it return list which time is not traded by anyone





