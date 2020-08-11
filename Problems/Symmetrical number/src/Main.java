import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int unidades;
        int decenas;
        int centenas;
        int umil;
        n = scanner.nextInt();
        unidades = n % 10;
        n = n / 10;
        decenas = n % 10;
        n = n / 10;
        centenas = n % 10;
        umil = n / 10;
        int rightAnswer = 1;
        int wrongAnswer = 37;
        if (unidades == umil && decenas == centenas) {
            System.out.println(rightAnswer);
        } else {
            System.out.println(wrongAnswer);
        }
    }
}
