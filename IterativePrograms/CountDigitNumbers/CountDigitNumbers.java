//Count digits in a number

package IterativePrograms.CountDigitNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigitNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int noOfDigits=0;
        int originalNumber=inputNumber;
        while(inputNumber>0){
            inputNumber=inputNumber/10;
            noOfDigits++;
        }
        System.out.println("Total number of digits in "+originalNumber+": "+noOfDigits);
    }
}
