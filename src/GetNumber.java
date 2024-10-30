import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {
        while(true) {
            String userAnswer = null;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter a number");
                userAnswer = scanner.next();
                int userInputAsAnswer = Integer.parseInt(userAnswer);
                break;
            } catch (NumberFormatException e) {
                // scenario 1
                System.out.println("Please enter a correct number, the number you inserted was wrong: " + userAnswer);
            } catch (Exception e) {
                // scenario 3
                System.out.println("Something went wrong. Please try again or contact the administrator.");

            }
        }
    }

    private static void getUserInputAndConvertToNumber(){

    }
}
