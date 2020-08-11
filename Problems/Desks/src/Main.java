import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int desks1 = (group1 + group1 % 2) / 2;
        int desks2 = (group2 + group2 % 2) / 2;
        int desks3 = (group3 + group3 % 2) / 2;
        System.out.println(desks1 + desks2 + desks3);
    }
}
