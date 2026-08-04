import java.util.Scanner;

public class TotalTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {

            System.out.print("Enter citizens name: ");
            String name = scanner.next();

            System.out.print("Enter earnings: ");
            double earnings = scanner.nextDouble();

            if(earnings == 0 || earnings < 0) {
                System.out.println("Invalid amount");
            }
            else if(earnings > 30000) {
                double rate = 0.2;
                double Total_tax = earnings * rate;
                System.out.println("The Total tax is: " + Total_tax);
            }
            else {
                double rate = 0.15;
                double Total_tax = earnings * rate;
                System.out.println("The Total tax is: " + Total_tax);
                    }
                }
            }
        }

