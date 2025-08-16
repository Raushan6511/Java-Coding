package MathBasedPrograms.DecimalToBinary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number: ");
        int decimalNumber=Integer.parseInt(br.readLine());
        int originalNumber=decimalNumber;
        StringBuilder binaryForm=new StringBuilder();
        while (decimalNumber>0) {
            int remainder=decimalNumber%2;
            decimalNumber=decimalNumber/2;
            binaryForm.append(remainder);
        }
        System.out.println("Binary no of "+originalNumber+" is: "+binaryForm.reverse().toString());
    }
}
