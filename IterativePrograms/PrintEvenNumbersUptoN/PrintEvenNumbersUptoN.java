// Print all even numbers from 1 to N

package IterativePrograms.PrintEvenNumbersUptoN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintEvenNumbersUptoN {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        for(int i=0;i<inputNumber;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
}
