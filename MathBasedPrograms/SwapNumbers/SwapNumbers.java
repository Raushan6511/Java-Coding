package MathBasedPrograms.SwapNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the first number: ");
        int firstNumber=Integer.parseInt(br.readLine());
        System.out.print("Please enter the second number: ");
        int secondNumber=Integer.parseInt(br.readLine());

        System.out.println("\nBefore Swapping:");
        System.out.println("First Number: "+firstNumber);
        System.out.println("Second Number: "+secondNumber);

        int temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("First Number: "+firstNumber);
        System.out.println("Second Number: "+secondNumber);
    }
}
