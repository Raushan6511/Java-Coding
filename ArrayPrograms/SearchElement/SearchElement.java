package ArrayPrograms.SearchElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchElement {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number to search:");
        int number= Integer.parseInt(br.readLine());   
        int[] arr ={3,5,7,9,10};
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                flag=1;
                System.out.println("Given number is found at index "+(i+1)+": "+number);
            }
        }
        if(flag==0){
            System.out.println("Number is not found");
        }
       
    }
}
