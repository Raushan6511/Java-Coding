package ArrayPrograms.CountEvenAndOdd;

import java.io.IOException;

public class CountEvenAndOdd {
    public static void main(String[] args) throws IOException{
        int[] arr ={3,5,7,9,10};
        int evenFlag =0;
        int oddFlag=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
                evenFlag++;
           }
           else{
            oddFlag++;
           }
        }
        System.out.println("Total number of even numbers are: "+evenFlag);
        System.out.println("Total number of odd numbers are: "+ oddFlag);
    }
}
