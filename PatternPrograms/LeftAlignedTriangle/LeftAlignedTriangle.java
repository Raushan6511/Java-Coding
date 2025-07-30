/*

*
* *
* * *
* * * *

 */
package PatternPrograms.LeftAlignedTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftAlignedTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        for( int i=0;i<inputNumber;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
