import java.util.*;

public class DuplicateCharacter {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Create an array to store the count of each character (assuming only lowercase a-z)
        int[] charCount = new int[26];

        // Loop through the string and update the count of each character
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            charCount[ch - 'a']++;  // Convert the character to array index
        }

        // Print the characters and their counts
        System.out.println("Character counts:");
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) (i + 'a') + " - " + charCount[i]);
            }
        }
    }
}
