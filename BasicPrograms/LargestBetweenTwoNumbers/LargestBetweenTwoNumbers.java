package BasicPrograms.LargestBetweenTwoNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestBetweenTwoNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first number:");
        int firstNumber=Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int secondNumber=Integer.parseInt(br.readLine());

        if(firstNumber>secondNumber)
            System.out.print(firstNumber+" is greater number.");
        else
            System.out.print(secondNumber+" is greater number");
    }
}