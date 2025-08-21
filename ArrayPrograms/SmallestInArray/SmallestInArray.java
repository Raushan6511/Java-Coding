package ArrayPrograms.SmallestInArray;

public class SmallestInArray {
    public static void main(String[] args) {
         int[] arr = {5, 3, 9, 1, 6};
         int min=arr[0];
         for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
         }
         System.out.print("Smallest element is :"+min);
    }
}
