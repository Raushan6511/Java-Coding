// Print Fibonacci series up to N terms	: 10 => 0 1 1 2 3 5 8
package IterativePrograms.PrintFibonacciUptoN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFibonacciUptoN {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number up to print Fibonacci Series: ");
        int inputNumber=Integer.parseInt(br.readLine());
        int firstNumber=0;
        int secondNumber=1;
        System.out.print(firstNumber+" ");
        System.out.print(secondNumber+" ");

        int next = firstNumber + secondNumber;

        while (next <= inputNumber) {
            System.out.print(next + " ");
            firstNumber=secondNumber;
            secondNumber=next;
            next = firstNumber + secondNumber;
        }
    }
}
