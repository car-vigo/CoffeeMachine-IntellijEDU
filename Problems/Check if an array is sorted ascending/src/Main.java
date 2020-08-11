import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numeros = new int[len];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        boolean answer = true;
        int numeroAnterior = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                numeroAnterior = numeros[i];
            } else {
                if (numeros[i] <= numeroAnterior) {
                    answer = false;
                }
            }
        }
        System.out.println(answer);
    }
}