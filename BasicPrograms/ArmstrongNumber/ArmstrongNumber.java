package BasicPrograms.ArmstrongNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {
    public static void main(String[] args)  throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        int originalNumber=inputNumber;
        int numberLength=getNumberLength(inputNumber);
        int lastDigit=0;
        int sum=0;
        // O(d)
        while (inputNumber!=0) {
            lastDigit=inputNumber%10;
            inputNumber=inputNumber/10;
            sum=sum+(int)Math.pow(lastDigit, numberLength);
        }
        if(originalNumber==sum)
            System.out.print(originalNumber+" is armstrong number.");
        else
            System.out.print(originalNumber+" is not armstrong number.");
        
    }
    // 
    public static int getNumberLength(int num){
        if(num==0) 
            return 1;
        int count=0;
        // while loop runs O(d) times, where d= number of digits present in the number (base-10 logarithm of n ⇒ log₁₀(n))
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
}

// Read input	O(1)
// Get digit length	O(d)
// Armstrong check loop	O(d)
// Final comparison	O(1)
// Total	O(d)

// time complexity= O(log10(n))= O(d)
// space complexity= O(1) because we uses only primitive types, no extra array or data structure used. 