
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();

        System.out.println(str1.toUpperCase().startsWith("J"));
    }
}