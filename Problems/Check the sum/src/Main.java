import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int suma1 = n1 + n2;
        int suma2 = n2 + n3;
        int suma3 = n3 + n1;
        boolean algunoEs20 = suma1 == 20 || suma2 == 20 || suma3 == 20;
        System.out.print(algunoEs20);
    }
}
