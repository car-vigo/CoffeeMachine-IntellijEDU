import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m;
        long n = 1;
        int contador = 1;
        m = scanner.nextLong();
        while (n <= m) {
            n *= contador++;
        }
        System.out.println(contador - 1);
    }
}
