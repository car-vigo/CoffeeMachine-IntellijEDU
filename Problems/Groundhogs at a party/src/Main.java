import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean answer = false;
        if (weekend && numberOfCups >= 15 && numberOfCups <= 25) {
            answer = true;
        } else if (!weekend && numberOfCups >= 10 && numberOfCups <= 20) {
            answer = true;
        }
        System.out.println(answer);
    }
}