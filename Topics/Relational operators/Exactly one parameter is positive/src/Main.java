import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final int zero = 0;

        boolean aPositive = a > zero && b <= zero && c <= zero;
        boolean bPositive = b > zero && a <= zero && c <= zero;
        boolean cPositive = c > zero && a <= zero && b <= zero;

        boolean result = aPositive || bPositive || cPositive;

        System.out.println(result);
    }
}