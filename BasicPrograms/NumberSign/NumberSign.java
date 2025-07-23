import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NumberSign {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int number=Integer.parseInt(br.readLine());
        if(number==0){
            System.out.println("Given number is Zero");
        }
        else if(number>0){
            System.out.println("Given number is +ve number");
        }
        else{
            System.out.println("Given number is -ve number");
        }
    }
}
