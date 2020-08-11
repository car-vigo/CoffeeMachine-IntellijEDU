import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numeros = new int[len];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean answer = false;
        for (int i = 0; i < numeros.length; i++) {
            if (n == numeros[i] && i - 1 >= 0 && m == numeros[i - 1]) {
                answer = true;
            } else if (n == numeros[i] && i + 1 < numeros.length && m == numeros[i + 1]) {
                answer = true;
            }
        }
        System.out.println(answer);
    }
}