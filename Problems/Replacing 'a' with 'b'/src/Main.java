import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        System.out.println(cadena.replace('a', 'b'));
    }
}
