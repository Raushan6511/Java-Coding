package IterativePrograms.StrongNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int originalNumber=inputNumber;
        int sum=0;
        while (inputNumber>0) {
            int lastDigit=inputNumber%10;
            inputNumber=inputNumber/10;
            sum=sum+factorial(lastDigit);
        }
        if(originalNumber==sum){
            System.out.println(originalNumber+" is Strong Number");
        }else{
            System.out.println(originalNumber+" is not a Strong Number");
        }
    }
    public static int factorial(int n){
        int fact=1;
        while(n>1){
            fact=fact*n;
            n--;
        }
        return fact;
    }
}
