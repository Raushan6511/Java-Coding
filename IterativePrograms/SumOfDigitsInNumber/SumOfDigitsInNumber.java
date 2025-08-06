// Sum of digits of a number
package IterativePrograms.SumOfDigitsInNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigitsInNumber {
     public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int sum=0;
        int originalNumber=inputNumber;
        while(inputNumber>0){
            int rem=inputNumber%10; // Get last digit
            sum=sum+rem;
            inputNumber=inputNumber/10; // remove the last digit
        }
        System.out.println("Sum of digits in "+originalNumber+": "+sum);
    }
}
