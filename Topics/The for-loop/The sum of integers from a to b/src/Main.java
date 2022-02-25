import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number1 = scanner.nextInt();
        final int number2 = scanner.nextInt();

        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}