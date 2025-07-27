package BasicPrograms.AlphabetCharOrNot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCharOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a character: ");
        char ch = br.readLine().charAt(0);  // Read a line and take the first character

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
    
}
