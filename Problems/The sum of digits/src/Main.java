import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int unidades = numero % 10;
        numero /= 10;
        int decenas = numero % 10;
        int centenas = numero / 10;
        int result = centenas + decenas + unidades;
        System.out.println(result);
    }
}