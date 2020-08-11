import  java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numeros = new int[len];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        int buscado = scanner.nextInt();
        int contador = 0;
        for (int numero : numeros) {
            if (numero == buscado) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}