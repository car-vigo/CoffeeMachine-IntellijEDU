import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String cuisinePreference = scanner.next();
        System.out.print("The form for ");
        System.out.print(name);
        System.out.print(" is completed. We will contact you if we need a chef that cooks ");
        System.out.print(cuisinePreference);
        System.out.print(" dishes.");
    }
}
