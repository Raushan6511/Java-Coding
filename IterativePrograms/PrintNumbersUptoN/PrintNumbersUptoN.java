// WAP to Print 1 to N numbers	
package IterativePrograms.PrintNumbersUptoN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbersUptoN {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        for(int i=0;i<inputNumber;i++){
            System.out.println(i+1);
        }
    }
}
