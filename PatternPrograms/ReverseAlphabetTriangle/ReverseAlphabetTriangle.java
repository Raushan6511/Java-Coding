package PatternPrograms.ReverseAlphabetTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseAlphabetTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the no of rows:");
        int rows=Integer.parseInt(br.readLine());

        for( int i=0;i<rows;i++){
            int temp=rows-i;
            for( int j=0;j<=i;j++){
                System.out.print((char)('A'+temp-1)+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
