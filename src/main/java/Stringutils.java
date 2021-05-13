import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Stringutils {
    public static void main(String[] args) {

//        Tells whether or not what the user entered is a number
//        Flips the case of the string
//        Reverses the string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Phrase, Please");
        String userInput = scanner.nextLine();
        System.out.println("StringUtils.isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
        System.out.println("StringUtils.swapCase(userInput) = " + StringUtils.swapCase(userInput));
        System.out.println("StringUtils.reverse(userInput) = " + StringUtils.reverse(userInput));
    }
}
