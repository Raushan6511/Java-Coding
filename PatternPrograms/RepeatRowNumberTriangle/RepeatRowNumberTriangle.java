/*

Repeating Row Number
1
2 2
3 3 3
4 4 4 4

 */
package PatternPrograms.RepeatRowNumberTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatRowNumberTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of rows:");
        int numberOfRows=Integer.parseInt(br.readLine()); 
        for(int i=0;i<numberOfRows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
