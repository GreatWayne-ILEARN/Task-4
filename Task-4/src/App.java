import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        int year = 2025;
        int month = 9; 
        LocalDate testDate = LocalDate.of(2025, 6, 13);

        // Run each program and output in one place
        MonthLength.run(year);
        MondaysInMonth.run(month, year);
        FridayChecker.run(testDate);
    }
}
