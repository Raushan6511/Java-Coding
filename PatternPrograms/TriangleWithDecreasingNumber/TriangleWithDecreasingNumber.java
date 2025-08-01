/*
 
Triangle with Decreasing Numbers
4 3 2 1
3 2 1
2 1
1

 */
package PatternPrograms.TriangleWithDecreasingNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleWithDecreasingNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of rows:");
        int numberOfRows=Integer.parseInt(br.readLine()); 
        for(int i=0;i<numberOfRows;i++){
            for(int j=numberOfRows-i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
