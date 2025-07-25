package BasicPrograms.NumberDivisibleByAnother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberDivisibleByAnother {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("please enter the dividend number:");
        int dividend=Integer.parseInt(br.readLine());
        System.out.print("Please enter the divisor:");
        int divisor=Integer.parseInt(br.readLine());

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else if (dividend % divisor == 0) {
            System.out.println(dividend + " is divisible by " + divisor);
        } else {
            System.out.println(dividend + " is not divisible by " + divisor);
        }
    }
}
