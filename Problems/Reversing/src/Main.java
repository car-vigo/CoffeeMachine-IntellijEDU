import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int unidades = numero % 10;
        numero /= 10;
        int decenas = numero % 10;
        int centenas = numero / 10;

        if (unidades != 0) {
            System.out.printf("%d%d%d", unidades, decenas, centenas);
        } else {
            System.out.printf("%d%d", decenas, centenas);
        }
    }
}