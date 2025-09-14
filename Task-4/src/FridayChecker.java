import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayChecker {
    public static void run(LocalDate date) {
        System.out.println("=== Friday the 13th Check ===");
        if (isFridayThe13th(date)) {
            System.out.println(date + " is Friday the 13th!");
        } else {
            System.out.println(date + " is NOT Friday the 13th.");
        }
        System.out.println();
    }

    public static boolean isFridayThe13th(LocalDate date) {
        return date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}