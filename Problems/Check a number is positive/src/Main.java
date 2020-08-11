import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
