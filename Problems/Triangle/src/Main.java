import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ladoA = scanner.nextInt();
        int ladoB = scanner.nextInt();
        int ladoC = scanner.nextInt();
        if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
