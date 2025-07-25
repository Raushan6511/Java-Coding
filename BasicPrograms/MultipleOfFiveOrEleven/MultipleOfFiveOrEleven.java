package BasicPrograms.MultipleOfFiveOrEleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleOfFiveOrEleven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int number=Integer.parseInt(br.readLine());
            if (number % 5 == 0 && number % 11 == 0) {
                System.out.println(number + " is a multiple of both 5 and 11.");
            } else if (number % 5 == 0) {
                System.out.println(number + " is a multiple of 5.");
            } else if (number % 11 == 0) {
                System.out.println(number + " is a multiple of 11.");
            } else {
                System.out.println(number + " is not a multiple of 5 or 11.");
            }
    }
}
