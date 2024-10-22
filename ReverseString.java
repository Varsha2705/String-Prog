import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

       
        char[] charArray = inputString.toCharArray();

       
        System.out.print("Reversed string: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
