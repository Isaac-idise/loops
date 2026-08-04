import java.util.Scanner;

public class Mileaage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <= 5; i++) {
            System.out.print("Enter miles driven: ");
            int miles = scanner.nextInt();

            System.out.print("Enter amount of gallons used: ");
            int gallons = scanner.nextInt();

            double milesPergallon = miles / gallons;

            System.out.println("The miles per gallon is: " + milesPergallon);

        }

    }
}
