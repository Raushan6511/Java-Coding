package BasicPrograms.VowelOrConsonant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelOrConsoNant {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a character:");
        char character=br.readLine().charAt(0);
        if("AEIOUaeiou".indexOf(character)!=-1) // O(n)
            System.out.println(character+" is a Vowel Letter.");
        else if(Character.isLetter(character)==true)
            System.out.println(character +" is a Consonant Letter.");
        else 
            System.out.println(character+" is not a character");
    }
}