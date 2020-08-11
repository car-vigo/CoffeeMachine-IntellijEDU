import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero > -15 && numero <= 12 || numero > 14 && numero < 17 || numero >= 19) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
