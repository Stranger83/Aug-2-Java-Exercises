import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class CountWorkingDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(scanner.nextLine(), df);
        LocalDate endDate = LocalDate.parse(scanner.nextLine(), df);
        int workingDays = 0;
        LocalDate[] holidays = new LocalDate[]{
                LocalDate.of(1, 12, 25),
                LocalDate.of(1, 1, 1),
                LocalDate.of(1, 3, 3),
                LocalDate.of(1, 5, 1),
                LocalDate.of(1, 5, 6),
                LocalDate.of(1, 5, 24),
                LocalDate.of(1, 9, 6),
                LocalDate.of(1, 9, 22),
                LocalDate.of(1, 11, 1),
                LocalDate.of(1, 12, 24),
                LocalDate.of(1, 12, 25),
                LocalDate.of(1, 12, 26)
        };

        for (LocalDate currentDate = startDate; currentDate.isBefore(endDate.plusDays(1)); currentDate = currentDate.plusDays(1)) {

            boolean isWeekend = currentDate.getDayOfWeek() == DayOfWeek.SATURDAY ||
                    currentDate.getDayOfWeek() == DayOfWeek.SUNDAY;
            int day = currentDate.getDayOfMonth();
            int month = currentDate.getMonth().getValue();
            boolean isHoliday = Arrays.stream(holidays).anyMatch(d -> d.getDayOfMonth() == day &&
                    d.getMonth().getValue() == month);
            if (!isWeekend && !isHoliday) {
                workingDays++;
            }
        }
        System.out.println(workingDays);
    }
}