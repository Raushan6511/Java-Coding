/*
 
   *
  * *
 * * *
* * * *

 */
package PatternPrograms.PyramidTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PyramidTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number: ");
        int inputNumber=Integer.parseInt(br.readLine());
        // number of rows
        for(int i=0;i<=inputNumber;i++ ){
            // print spaces
            int noOfSpaces=inputNumber-i+1;
            for(int s=0;s<=noOfSpaces;s++){
                System.out.print(" ");
            }
            // print stars
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
