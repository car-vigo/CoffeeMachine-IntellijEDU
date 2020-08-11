import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numeros = new int[len];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println(menor);
    }
}