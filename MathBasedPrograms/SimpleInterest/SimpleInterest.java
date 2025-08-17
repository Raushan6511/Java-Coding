package MathBasedPrograms.SimpleInterest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter principle amount:");
        int principleAmount=Integer.parseInt(br.readLine());
        System.out.print("please enter the rate:");
        int rate=Integer.parseInt(br.readLine());
        System.out.print("Please enter the time:");
        int time=Integer.parseInt(br.readLine());

        int simpleInterest=(principleAmount*rate*time)/100;
        System.out.println("Simple Interest: "+simpleInterest );

    }
}
