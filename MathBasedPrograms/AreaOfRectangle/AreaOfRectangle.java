package MathBasedPrograms.AreaOfRectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfRectangle {
    public static void main(String[] arg) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the length of rectangle: ");
        int lengthOfRectangle=Integer.parseInt(br.readLine());
        System.out.print("Please enter the width of rectangle: ");
        int widthOfRectangle=Integer.parseInt(br.readLine());

        System.out.println("Area of rectangle: "+lengthOfRectangle*widthOfRectangle);
    }
}
