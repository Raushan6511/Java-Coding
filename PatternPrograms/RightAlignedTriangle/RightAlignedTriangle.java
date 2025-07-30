/*
 
      *
    * *
  * * *
* * * *

 */

package PatternPrograms.RightAlignedTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightAlignedTriangle {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        for( int i=0;i<inputNumber;i++){
            // print spaces
            int numberOfSpaces=inputNumber-i+1;
            for(int k=0;k<=numberOfSpaces;k++){
                System.out.print("  ");
            }

            // print star's
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
