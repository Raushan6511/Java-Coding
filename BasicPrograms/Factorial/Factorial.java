import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int number=Integer.parseInt(br.readLine());
        int factorial=1;
        while (number>0) {
            factorial=factorial*number;
            number--;
        }
        System.out.println("factorial of given number:"+factorial);
    }
}
