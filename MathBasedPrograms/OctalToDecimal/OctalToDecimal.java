package MathBasedPrograms.OctalToDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToDecimal {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a binary number: ");
        int octalNumber=Integer.parseInt(br.readLine());
        int originalOctalNumber=octalNumber;
        int power=0;
        int decimalNumber=0;
        while(octalNumber>0){
            int remainder=octalNumber%10;
            octalNumber=octalNumber/10;
            decimalNumber=(int) ((Integer)decimalNumber+ remainder*Math.pow(8, power));
            power++;
        }
        System.out.print("The decimal number of "+originalOctalNumber+" is: "+decimalNumber);

    }
}
