/*

Repeating Characters
A
B B
C C C
D D D D

 */
package PatternPrograms.RepeatingCharacterTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatingCharacterTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of row:");
        int rows=Integer.parseInt(br.readLine());
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }
    }
}
