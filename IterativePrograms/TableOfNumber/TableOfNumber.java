// Print multiplication table of a number

package IterativePrograms.TableOfNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableOfNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number:");
        int inputNumber=Integer.parseInt(br.readLine());
        for(int i=0;i<10;i++){
            System.out.println(inputNumber+" x "+(i+1)+" = "+inputNumber*(i+1));
        }
    }
}
