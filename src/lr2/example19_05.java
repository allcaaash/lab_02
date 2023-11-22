package lr2;
import java.util.Scanner;
import java.math.RoundingMode;

public class example19_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double userNumber = 0;

        System.out.print("Enter the number: ");
        userNumber = scanner.nextDouble();

        //I use explicit data type casting because I'm only interested in the integer value
        int number = (int) userNumber;

        String result = Integer.toString(number);
        int charPos = result.length() - 4;
        char ch = result.charAt(charPos);

        System.out.format("In your number (%s), the number %s is located in the fourth position on the right (when rounded to an integer)", userNumber, ch);
    }
}
