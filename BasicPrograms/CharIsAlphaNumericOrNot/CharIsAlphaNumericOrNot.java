package BasicPrograms.CharIsAlphaNumericOrNot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIsAlphaNumericOrNot {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a character:");
        char inputCharacter=br.readLine().charAt(0);
        if(Character.isLetterOrDigit(inputCharacter))
            System.out.println(inputCharacter+" is alphanumeric character.");
        else
            System.out.println(inputCharacter+" is not alphanumeric character.");
    }
}
