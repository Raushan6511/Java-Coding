package BasicPrograms.CharacterCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterCase {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a character: ");
        char ch= br.readLine().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println(ch+" is Uppercase character.");
            return;
        }
        System.out.println(ch+" is Lowercase character.");
    }
}
