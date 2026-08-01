import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales1 amount: ");
        double sales1 = scanner.nextDouble();

        System.out.println("Enter sales2 amount: ");
        double sales2 = scanner.nextDouble();

        System.out.println("Enter sales3 amount: ");
        double sales3 = scanner.nextDouble();

        System.out.println("Enter sales4 amount: ");
        double sales4 = scanner.nextDouble();

        double commission1 = (200 + (0.09 * sales1));
        System.out.println("The first commission is: " + commission1);

        double commission2 = (200 + (0.09 * sales2));
        System.out.println("The second commission is: " + commission2);

        double commission3 = (200 + (0.09 * sales3));
        System.out.println("The third commission is: " + commission3);

        double commission4 = (200 + (0.09 * sales4));
        System.out.println("The forth commission is: " + commission4);


    }
}
