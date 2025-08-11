// Find LCM of two numbers.
package IterativePrograms.LcmOfTwoNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LcmOfTwoNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter first number:");
        int firstNumber=Integer.parseInt(br.readLine());
        System.out.print("Please enter second number:");
        int secondNumber=Integer.parseInt(br.readLine());
        int lcm=(firstNumber*secondNumber)/(gcd(firstNumber,secondNumber));
        System.out.print("LCM of "+firstNumber+" & "+secondNumber+" = "+lcm);
    }

    public static int gcd(int first, int second){
        int divident = first;
        int divisor = second;
        
        while (divisor != 0) {
            int remainder = divident % divisor;
            divident = divisor;
            divisor = remainder;
        }
        return divident;
    }
}
