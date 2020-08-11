import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int category = scanner.nextInt();
        if (category < 1) {
            System.out.println("no army");
        } else if (category <= 19) {
            System.out.println("pack");
        } else if (category <= 249) {
            System.out.println("throng");
        } else if (category <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
