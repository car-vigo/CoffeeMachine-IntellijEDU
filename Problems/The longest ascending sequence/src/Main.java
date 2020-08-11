import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numeros = new int[len];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        int contadorSecuencia = 1;
        int contadorSecuenciaMax = 1;
        int anterior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > anterior) {
                contadorSecuencia++;
                if (contadorSecuencia > contadorSecuenciaMax) {
                    contadorSecuenciaMax = contadorSecuencia;
                }
            } else {
                contadorSecuencia = 1;
            }
            anterior = numeros[i];
        }
        System.out.println(contadorSecuenciaMax);


    }
}