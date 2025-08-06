package PatternPrograms.AdvancePattern.HollowDiamondSquare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HollowDiamondSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("please enter the rows:");
        int inputNumber=Integer.parseInt(br.readLine());
        int rows= inputNumber%2==0 ?inputNumber+1:inputNumber;
        for(int row =0;row<rows;row++){
            for(int col=0;col<rows;col++){
                if(row==col||rows-1==row+col||row==0||row==rows-1||col==0||col==rows-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
