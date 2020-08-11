import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationInDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNightInAHotel = scanner.nextInt();
        int result = durationInDays * foodCostPerDay
                + costOfOneNightInAHotel * (durationInDays - 1)
                + oneWayFlightCost * 2;
        System.out.println(result);
    }
}