import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter one number:");
        int number=Integer.parseInt(br.readLine());
        if(number%2==0){
            System.out.println(number +" is Even number");
            return;
        }
        System.out.println(number +" is Odd number");
    }
}
