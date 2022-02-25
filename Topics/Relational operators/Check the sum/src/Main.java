import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int compareNumber = 20;

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final int ab = a + b;
        final int ac = a + c;
        final int bc = b + c;

        boolean result = ab == compareNumber
                || ac == compareNumber
                || bc == compareNumber;

        System.out.println(result);
    }
}