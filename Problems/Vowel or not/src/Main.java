import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean answer;
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                answer = true;
                break;
            default:
                answer = false;
                break;
        }
        return answer;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}