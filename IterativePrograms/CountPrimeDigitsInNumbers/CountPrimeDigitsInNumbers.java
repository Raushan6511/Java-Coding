package IterativePrograms.CountPrimeDigitsInNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountPrimeDigitsInNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int count=0;
        while(inputNumber!=0){
            int rem=inputNumber%10;
            inputNumber=inputNumber/10;
            if(isPrime(rem)==true){
                count++;
            }
        }
        System.out.println("Total number of primes digits are: "+count);
    }
    // static boolean isPrime(int n){
    //     if(n<=1) return false;
    //     if(n==2) return true;
    //     if(n%2==0) return false;
        
    //     for (int i = 3; i * i <= n; i += 2) {
    //         if (n % i == 0) return false;
    //     }
    //     return true;
    // }
    
    // improvement
    static boolean isPrime(int n){
        return n == 2 || n == 3 || n == 5 || n == 7;
    }
}
