import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean answer = number < 10 && number > 0;
        System.out.println(answer);
    }
}