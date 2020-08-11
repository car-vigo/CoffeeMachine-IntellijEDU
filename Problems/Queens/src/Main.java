import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        boolean match = false;
        int suma1 = x1 + y1;
        int suma2 = x2 + y2;
        int diferencia = Math.abs(x1 - y1) - Math.abs(x2 - y2);
        if (suma1 == suma2) {
            match = true;
        } else if (x1 == x2 || x1 == y2 || y1 == x2 || y1 == y2) {
            match = true;
        } else if (x1 == y1 && x2 == y2) {
            match = true;
        } else if (diferencia == 0) {
            match = true;
        }
        if (match) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
