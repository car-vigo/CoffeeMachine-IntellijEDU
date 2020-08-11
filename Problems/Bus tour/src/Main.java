import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alturaBus = scanner.nextInt();
        int cantidadDePuentes = scanner.nextInt();
        int alturaDePuente;
        boolean impacto = false;
        int puenteDeImpacto = 0;
        for (int i = 0; i < cantidadDePuentes; i++) {
            alturaDePuente = scanner.nextInt();
            if (alturaDePuente <= alturaBus && puenteDeImpacto == 0) {
                puenteDeImpacto = i + 1;
                impacto = true;
            }
        }
        if (impacto) {
            System.out.printf("Will crash on bridge %d", puenteDeImpacto);
        } else {
            System.out.println("Will not crash");
        }
    }
}
