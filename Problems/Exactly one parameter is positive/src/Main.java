import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean answer1 = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean answer2 = n2 > 0 && n1 <= 0 && n3 <= 0;
        boolean answer3 = n3 > 0 && n2 <= 0 && n1 <= 0;
        boolean answer = answer1 || answer2 || answer3;
        System.out.println(answer);
    }
}