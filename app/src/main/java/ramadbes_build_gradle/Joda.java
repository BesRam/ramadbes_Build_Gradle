package ramadbes_build_gradle;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Joda {
    public static void main(String[] args) {
        // Aktuelle Zeit erstellen
        DateTime now = new DateTime();

        // Formatierer definieren
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd.MM.yyyy HH:mm:ss");

        // Ausgabe
        System.out.println("Aktuelles Datum und Uhrzeit: " + fmt.print(now));

        // Addiere fünf Tage zum aktuellen Datum
        DateTime futureDate = now.plusDays(10);
        System.out.println("Datum in zehn Tagen: " + fmt.print(futureDate));
    }
}
