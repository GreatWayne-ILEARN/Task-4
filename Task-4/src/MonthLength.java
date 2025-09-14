import java.time.YearMonth;

public class MonthLength {
    public static void run(int year) {
        System.out.println("=== Length of Each Month in " + year + " ===");

        for (int month = 1; month <= 12; month++) {
            YearMonth ym = YearMonth.of(year, month);
            int length = ym.lengthOfMonth();
            System.out.println(ym.getMonth() + " " + year + " has " + length + " days.");
        }
        
        System.out.println();
    }
}
