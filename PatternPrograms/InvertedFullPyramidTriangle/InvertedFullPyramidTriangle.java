/*
 
*******
 *****
  ***
   *

 */
package PatternPrograms.InvertedFullPyramidTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvertedFullPyramidTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        for(int i=0;i<inputNumber;i++){
            
            // print spaces
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }

            // print stars
            for(int j=0;j<2*inputNumber-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
