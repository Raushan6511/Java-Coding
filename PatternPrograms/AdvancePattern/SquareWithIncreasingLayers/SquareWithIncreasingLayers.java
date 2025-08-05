/*
Square Pattern with Increasing Layers

0 0 0 0 0 0 0 0 0 
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0 
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0 

 */
package PatternPrograms.AdvancePattern.SquareWithIncreasingLayers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareWithIncreasingLayers {
     public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int numberOfRows=inputNumber*2;
        for(int row=0;row<=numberOfRows;row++){
            for(int col=0;col<=numberOfRows;col++){
                int elementAtElement=Math.min(Math.min(row,col), Math.min(numberOfRows-row, numberOfRows-col));
                System.out.print(elementAtElement+" ");
            }
            System.out.println();
        }
    }
}
