package lr2;
import java.util.Scanner;

public class example19_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userStr = "";

        System.out.print("Enter a number to check if the criteria are met (the number falls in the range from 5 to 10 inclusive): ");
        userStr = scanner.next();

        while (!isNumber(userStr)){

            System.out.println("Error. Invalid input data. Repeat again.");
            System.out.print("Enter a number to check if the criteria are met (the number falls in the range from 5 to 10 inclusive): ");
            userStr = scanner.next();
        }

        double userNum = Double.parseDouble(userStr);

        if (userNum >= 5 && userNum <= 10){ System.out.print("Your number meets the criteria"); }
        else { System.out.print("Your number does not meet the criteria"); }
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
