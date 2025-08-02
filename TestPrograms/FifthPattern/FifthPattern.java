package TestPrograms.FifthPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FifthPattern {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the number of rows:");
        int rows=Integer.parseInt(br.readLine());
        for( int i=0;i<rows;i++){
            if(i==0){
                    System.out.print("* ");
            }
            if(i!=0&&i!=rows-1){
                System.out.print("* ");
                for(int k=0;k<i-1;k++)
                    System.out.print("  ");
                System.out.print("* ");
            }
            if(i==rows-1){
                for(int l=0;l<rows;l++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
