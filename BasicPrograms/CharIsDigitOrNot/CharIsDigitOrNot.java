package BasicPrograms.CharIsDigitOrNot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIsDigitOrNot {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a char:");
        char inputCharacter=br.readLine().charAt(0);
        if(Character.isDigit(inputCharacter))
            System.out.println(inputCharacter+" is a digit.");
        else
            System.out.println(inputCharacter+" is not a digit");
    }
}
