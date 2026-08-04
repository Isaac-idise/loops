import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int largest = 0;

        for (int counter = 1; counter <= 10; counter++) {
          System.out.print("Enter number: ");
          int number = scanner.nextInt();

          if( number >  largest) {
              largest = number;
          }
      }
        System.out.println("The largest number is: "+ largest);
    }
}
