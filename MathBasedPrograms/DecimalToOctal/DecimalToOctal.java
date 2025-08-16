package MathBasedPrograms.DecimalToOctal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToOctal {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number: ");
        int decimalNumber=Integer.parseInt(br.readLine());
        int originalNumber=decimalNumber;
        StringBuilder octalForm=new StringBuilder();
        while (decimalNumber>0) {
            int remainder=decimalNumber%8;
            decimalNumber=decimalNumber/8;
            octalForm.append(remainder);
        }
        System.out.println("Octal no of "+originalNumber+" is: "+octalForm.reverse().toString());
    }
}
