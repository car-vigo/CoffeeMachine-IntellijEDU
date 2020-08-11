import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String room = scanner.nextLine();
        double area;
        switch (room) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double perimetro = (a + b + c) / 2;
                area = Math.sqrt(perimetro * (perimetro - a) * (perimetro - b) * (perimetro - c));
                System.out.print(area);
                break;
            case "circle":
                double r = scanner.nextDouble();
                area = 3.14 * Math.pow(r, 2);
                System.out.print(area);
                break;
            case "rectangle":
                double base = scanner.nextDouble();
                double high = scanner.nextDouble();
                area = base * high;
                System.out.print(area);
                break;
            default:
                break;
        }
    }
}
