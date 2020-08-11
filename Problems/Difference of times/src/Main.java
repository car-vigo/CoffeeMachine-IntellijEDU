import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora1 = scanner.nextInt();
        int minuto1 = scanner.nextInt();
        int segundo1 = scanner.nextInt();
        int hora2 = scanner.nextInt();
        int minuto2 = scanner.nextInt();
        int segundo2 = scanner.nextInt();
        int difHora = hora2 - hora1;
        int difMin = minuto2 - minuto1;
        int difSeg = segundo2 - segundo1;
        int resultado = difHora * 3600 + difMin * 60 + difSeg;
        System.out.println(resultado);
    }
}