import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int limit1Day = 10;
        final int limit2Day = 20;
        final int limit1Weekday = 15;
        final int limit2Weekday = 25;
        boolean weekday = true;

        final int number = scanner.nextInt();
        boolean day = scanner.nextBoolean();

        boolean resultDay =
                number >= limit1Day && number <= limit2Day
                        && day != weekday;
        boolean resultWeekday =
                number >= limit1Weekday && number <= limit2Weekday
                        && day == weekday;

        boolean result = resultDay || resultWeekday;

        System.out.println(result);
    }
}