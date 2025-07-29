package BasicPrograms.CharIsSpecialSymbolOrNot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIsSpecialSymbolOrNot {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a character:");
        char inputCharacter=br.readLine().charAt(0);
        if(!Character.isLetterOrDigit(inputCharacter))
            System.out.println(inputCharacter+" is Special symbol.");
        else
            System.out.println(inputCharacter+" is not a special symbol.");
    }
}
