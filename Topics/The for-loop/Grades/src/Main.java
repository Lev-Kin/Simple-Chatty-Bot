import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;
        for (int i = 0; i < n; i++) {

            String letter = scanner.next();

            if ("A".equalsIgnoreCase(letter)) {
                sumA += 1;
            } else if ("B".equalsIgnoreCase(letter)) {
                sumB += 1;
            } else if ("C".equalsIgnoreCase(letter)) {
                sumC += 1;
            } else {
                sumD += 1;
            }
        }

        System.out.println(sumD + " " + sumC + " " + sumB + " " + sumA);
    }
}