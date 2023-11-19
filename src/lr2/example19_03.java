package lr2;
import java.util.Scanner;

public class example19_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userStr = "";

        System.out.print("Enter a number to check if the criteria are met (the number is divisible by 4 and at least 10): ");
        userStr = scanner.next();

        while (!isNumber(userStr)){

            System.out.println("Error. Invalid input data. Repeat again.");
            System.out.print("Enter a number to check if the criteria are met (the number is divisible by 4 and at least 10): ");
            userStr = scanner.next();
        }

        double userNum = Double.parseDouble(userStr);

        if (userNum % 4 == 0 && userNum >= 10){ System.out.print("Your number meets the criteria"); }
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
