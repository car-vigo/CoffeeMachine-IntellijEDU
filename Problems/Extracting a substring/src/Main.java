import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        int inicio = scanner.nextInt();
        int fin = scanner.nextInt() + 1;
        System.out.println(cadena.substring(inicio, fin));
    }
}