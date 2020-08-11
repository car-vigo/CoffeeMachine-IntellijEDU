import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numeros = new int[len];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        int incognita = scanner.nextInt();
        boolean contiene = false;
        for (int numero : numeros) {
            if (numero == incognita) {
                contiene = true;
            }
        }
        System.out.println(contiene);
    }
}