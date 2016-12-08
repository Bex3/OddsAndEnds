import java.util.Scanner;

/**
 * Created by bearden-tellez on 12/8/16.
 */
public class FizzBuzz {
    public static void main(String[] args) {

        for (int counter = 0; counter < 100; counter ++) {
            if ((counter % 5) == 0 && (counter % 3) == 0) {
                System.out.println("Fizzbuzz");
            } else if ((counter % 5) == 0) {
                System.out.println("Fizz");
            } else if ((counter % 3) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Sorry that number isn't Fizz, Buzz or FizzBuzz");
            }
        }
    }
}
