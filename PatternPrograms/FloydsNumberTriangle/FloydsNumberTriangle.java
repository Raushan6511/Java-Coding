/*

Floyd’s Triangle
1
2 3
4 5 6
7 8 9 10

 */
package PatternPrograms.FloydsNumberTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloydsNumberTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of rows:");
        int numberOfRows=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<numberOfRows;i++){
            for(int j=0;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }

    }
}
