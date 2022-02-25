import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        boolean result = a >= b && a <= c
                || a <= b && a >= c;

        System.out.println(result);
    }
}