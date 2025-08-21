package ArrayPrograms.SumOfArrayElement;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int[] arr ={2,5,7,9,10};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("The sum of array elements is :"+sum);
    }
}
