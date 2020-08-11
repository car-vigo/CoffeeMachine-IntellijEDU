import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numeros = new int[len];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        int maxProduct = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 1; j < numeros.length; j++) {
                if (j != i && numeros[i] * numeros[j] > maxProduct) {
                    maxProduct = numeros[i] * numeros[j];
                }
            }
        }
        System.out.println(maxProduct);
    }
}