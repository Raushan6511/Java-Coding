// Print the sum of 1 to N numbers
package IterativePrograms.PrintSumOfNumbersUptoN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSumOfNumbersUptoN {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0;i<=inputNumber;i++){
            sum=sum+i;
        }
        System.out.print("The sum of number up to "+inputNumber+": "+sum);
    }
}
