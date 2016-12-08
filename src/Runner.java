import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by bearden-tellez on 11/17/16.
 */
public class Runner {

    public static void main(String[] args) {
        Runner myRunner = new Runner();
        System.out.println( "Running");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter a word you would like to test for palindrome status..");
        String userInput = inputScanner.nextLine();


        myRunner.palindromeText(userInput);
    }

    public void palindromeText(String userInput){
        String reversedString = new StringBuilder(userInput).reverse().toString();

        if (reversedString.equalsIgnoreCase(userInput)){
            System.out.println("It's a palindrome! ");
        } else {
            System.out.println("Not a Palindrome try again");
        }
    }
}
