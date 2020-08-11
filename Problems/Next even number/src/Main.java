import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int nextEven;
        if (number % 2 != 0) {
            nextEven = number + 1;
        } else {
            nextEven = number + 2;
        }
        System.out.println(nextEven);
    }
}