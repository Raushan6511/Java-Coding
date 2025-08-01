/*
 
Alphabet Triangle
A
A B
A B C
A B C D

 */
package PatternPrograms.AlphabetTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of rows:");
        int numberOfRows=Integer.parseInt(br.readLine()); 
        for(int i=0;i<numberOfRows;i++){
            // for(char ch = 'A'; ch <= 'A' + i; ch++){
            //     System.out.print(ch+" ");
            // }
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
    
}
