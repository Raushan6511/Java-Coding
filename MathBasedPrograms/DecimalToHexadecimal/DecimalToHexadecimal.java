package MathBasedPrograms.DecimalToHexadecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToHexadecimal {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a decimal number: ");
        int decimalNumber=Integer.parseInt(br.readLine());
        int originalDecimalNumber=decimalNumber;
        StringBuilder hexadecimalForm=new StringBuilder();
         String hexDigits = "0123456789ABCDEF";
        while (decimalNumber>0) {
            int remainder=decimalNumber%16;
            decimalNumber=decimalNumber/16;
            hexadecimalForm.insert(0, hexDigits.charAt(remainder));
        }
        System.out.println("The hexadecimal of "+originalDecimalNumber+" is:"+hexadecimalForm.toString());
    }
}
