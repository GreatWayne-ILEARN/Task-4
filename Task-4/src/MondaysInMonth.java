import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class MondaysInMonth {
    public static void run(int month, int year) {
        YearMonth ym = YearMonth.of(year, month);
        LocalDate date = ym.atDay(1);

        System.out.println("=== Mondays in " + ym.getMonth() + " " + year + " ===");
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
        System.out.println();
    }
}
