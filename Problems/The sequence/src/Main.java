import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n;
        long max = 0;
        int contador = 0;
        while (scanner.hasNextLong() && contador <= 1000) {
            n = scanner.nextLong();
            if (n % 4 == 0 && n >= max) {
                max = n;
            }
            contador++;
        }
        System.out.println(max);
    }
}
