import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        String operator = scanner.next();
        long b = scanner.nextLong();
        long anserw;
        switch (operator) {
            case "+":
                anserw = a + b;
                System.out.print(anserw);
                break;
            case "-":
                anserw = a - b;
                System.out.print(anserw);
                break;
            case "/":
                if (b == 0) {
                    System.out.print("Division by 0! ");
                } else {
                    anserw = a / b;
                    System.out.print(anserw);
                }
                break;
            case "*":
                anserw = a * b;
                System.out.print(anserw);
                break;
            default:
                System.out.print("Unknown operator");
                break;
        }
    }
}