package MathBasedPrograms.AreaOfTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfTriangle {
    public static void main(String[] arg) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the height of triangle: ");
        int heightOfTriangle=Integer.parseInt(br.readLine());
        System.out.print("Please enter the base of triangle: ");
        int baseOfTriangle=Integer.parseInt(br.readLine());

        System.out.println("Area of triangle: "+(heightOfTriangle*baseOfTriangle)/2);
    }
}
