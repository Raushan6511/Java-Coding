package BasicPrograms.PalindromeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int originalNumber = inputNumber;
        int reversedNumber = 0;
        int lastDigit = 0;
        while (inputNumber != 0) {
            lastDigit = inputNumber % 10;       // Get the last digit of input number
            inputNumber = inputNumber / 10;     // Remove last digit of input number
            reversedNumber = reversedNumber * 10 + lastDigit;       // Add digit to reversed number
        }
        if(originalNumber == reversedNumber)
            System.out.println(originalNumber +" is palindrome number.");
        else
            System.out.println(originalNumber + " is not palindrome number.");
    }
}
