import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble() / 100;
        double k = scanner.nextDouble();
        double actual = 0;
        int contador = 0;
        while (m < k) {
            actual = m * p;
            m += actual;
            contador++;
        }
        System.out.println(contador);
    }
}
