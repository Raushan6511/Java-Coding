/*

* * * *
 * * *
  * *
   *

 */
package PatternPrograms.InvertedPyramidTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvertedPyramidTriangle {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number: ");
        int inputNumber=Integer.parseInt(br.readLine());
        // outer loop for number of rows
        for(int i=0;i<inputNumber;i++){
            
            // print spaces
            int numberOfSpaces=i;
            for(int k=0;k<numberOfSpaces;k++){
                System.out.print(" ");
            }
            
            // print stars
            for(int j=0;j<inputNumber-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
