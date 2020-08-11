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

        System.out.println(neverOccurNext(numeros, n, m));
    }

    public static boolean neverOccurNext(int[] numeros, int n, int m) {
        boolean answer = true;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n && i - 1 >= 0 && numeros[i - 1] == m) {
                answer = false;
                break;
            } else if (numeros[i] == m && i - 1 >= 0 && numeros[i - 1] == n) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}