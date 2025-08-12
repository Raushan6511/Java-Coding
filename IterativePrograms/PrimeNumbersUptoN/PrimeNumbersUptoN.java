package IterativePrograms.PrimeNumbersUptoN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbersUptoN {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        for(int i=0;i<=inputNumber;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
