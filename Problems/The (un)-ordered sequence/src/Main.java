import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAnterior = scanner.nextInt();
        int numeroActual = scanner.nextInt();
        boolean secuenciaOrdenada = true;
        if (numeroActual >= numeroAnterior && numeroActual != 0) {
            numeroAnterior = numeroActual;
            while ((numeroActual = scanner.nextInt()) != 0) {
                if (numeroActual < numeroAnterior) {
                    secuenciaOrdenada = false;
                }
                numeroAnterior = numeroActual;
            }
        } else if (numeroActual <= numeroAnterior && numeroActual != 0) {
            numeroAnterior = numeroActual;
            while ((numeroActual = scanner.nextInt()) != 0) {
                if (numeroActual > numeroAnterior) {
                    secuenciaOrdenada = false;
                }
                numeroAnterior = numeroActual;
            }
        }
        System.out.println(secuenciaOrdenada);
    }
}