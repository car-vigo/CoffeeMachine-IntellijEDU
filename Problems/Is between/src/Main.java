import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean answer = n1 >= n2 && n1 <= n3 || n1 >= n3 && n1 <= n2;
        System.out.println(answer);
    }
}