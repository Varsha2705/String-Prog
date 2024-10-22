import java.util.*;

public class ShiftCharacter {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Initialize an empty string to store the result
        String shiftedString = "";

        // Loop through the string and shift each character
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // If the character is 'z', change it to 'a'
            if (ch == 'z') {
                shiftedString += 'a';
            }
            // If the character is 'Z', change it to 'A' (for uppercase)
            else if (ch == 'Z') {
                shiftedString += 'A';
            }
            // For other characters, just add 1 to shift it
            else {
                shiftedString += (char)(ch + 1);
            }
        }

        // Print the shifted string
        System.out.println("Shifted string: " + shiftedString);
    }
}
