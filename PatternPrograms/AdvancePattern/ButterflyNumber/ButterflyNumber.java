package PatternPrograms.AdvancePattern.ButterflyNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ButterflyNumber {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of rows:");
        int row=Integer.parseInt(br.readLine());
        for( int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            for(int s=0;s<(row-1)*2-2*i;s++){
                System.out.print(" ");
            }
            for(int k=i;k>=0;k--){
                System.out.print(k+1);
            }
            System.out.println();
        }
    }
}
