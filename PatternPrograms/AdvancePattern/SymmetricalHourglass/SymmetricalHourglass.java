package PatternPrograms.AdvancePattern.SymmetricalHourglass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SymmetricalHourglass {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter number of rows:");
        int rows=Integer.parseInt(br.readLine());
        for(int i=0;i<rows;i++){
            for(int s=0;s<=i;s++){
                System.out.print(" ");
            }
            for( int j=0;j<((2*rows)-1)-2*i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int k=1;k<rows;k++){
            for(int p=0;p<rows-k;p++){
                System.out.print(" ");
            }
            for(int l=0;l<2*k+1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
