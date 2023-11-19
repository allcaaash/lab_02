package lr2;
import java.util.Scanner;

public class example19_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userStr = "";

        System.out.print("Enter a number to check the criteria (the remainder of the division by 5 is 2 and the remainder of the division by 7 is 1): ");
        userStr = scanner.next();

        while (!isNumber(userStr)){

            System.out.println("Error. Invalid input data. Repeat again.");
            System.out.print("Enter a number to check the criteria (the remainder of the division by 5 is 2 and the remainder of the division by 7 is 1): ");
            userStr = scanner.next();
        }

        double userNum = Double.parseDouble(userStr);

        if (userNum % 5 == 2 && userNum % 7 == 1){ System.out.print("Your number meets the criteria"); }
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