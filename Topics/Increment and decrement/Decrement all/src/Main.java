import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        final int aa = --a;
        final int bb = --b;
        final int cc = --c;
        final int dd = --d;

        System.out.println(aa + " " + bb + " " + cc + " " + dd);
    }
}