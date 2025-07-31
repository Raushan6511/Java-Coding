/*

1
1 2
1 2 3
1 2 3 4

 */
package PatternPrograms.IncrementalNumberTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncrementalNumberTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the number of rows:");
        int numberOfRows=Integer.parseInt(br.readLine());
        for(int i=0;i<numberOfRows;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
