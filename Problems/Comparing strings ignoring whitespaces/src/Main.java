import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = scanner.nextLine().trim().replace(" ","");
        String cadena2 = scanner.nextLine().trim().replace(" ","");
        boolean respuesta = cadena1.equals(cadena2);
        System.out.println(respuesta);
    }
}