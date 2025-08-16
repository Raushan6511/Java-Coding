// i will enhance this code by using bit manipulation later.
package MathBasedPrograms.BinaryToDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimal {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a binary number: ");
        int binaryNumber=Integer.parseInt(br.readLine());
        int originalBinaryNumber=binaryNumber;
        int power=0;
        int decimalNumber=0;
        while(binaryNumber>0){
            int remainder=binaryNumber%10;
            binaryNumber=binaryNumber/10;
            decimalNumber=(int) ((Integer)decimalNumber+ remainder*Math.pow(2, power));
            power++;
        }
        System.out.print("The decimal number of "+originalBinaryNumber+" is: "+decimalNumber);

    }
}
