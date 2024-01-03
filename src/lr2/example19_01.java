package lr2;
import java.util.Scanner;

public class example19_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userStr = "";

        System.out.print("Enter a number to check the division by 3: ");
        userStr = scanner.next();

        while (!isNumber(userStr)) {

            System.out.println("Error. Invalid input data. Repeat again.");
            System.out.print("Enter a number to check the division by 3: ");
            userStr = scanner.next();
        }

        double userNum = Double.parseDouble(userStr);

        if (userNum % 3 == 0){ System.out.print("Your number is divisible by 3"); }
        else { System.out.print("Your number is not divisible by 3"); }
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