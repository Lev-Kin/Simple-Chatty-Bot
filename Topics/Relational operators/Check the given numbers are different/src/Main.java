import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        boolean checkA = a != b && a != c;
        boolean checkB = b != a && b != c;
        boolean checkC = c != b && c != a;

        boolean result = checkA && checkB && checkC;

        System.out.println(result);

    }
}