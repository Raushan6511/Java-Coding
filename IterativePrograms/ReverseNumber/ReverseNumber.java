// Reverse a number
package IterativePrograms.ReverseNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int originalNumber=inputNumber;
        int reverse=0;
        while(inputNumber>0){
            int rem=inputNumber%10; // Get last digit
            inputNumber=inputNumber/10; // remove the last digit
            reverse=reverse*10+rem;
           
        }
        System.out.println("Sum of digits in "+originalNumber+": "+reverse);
    }
}
