package ArrayPrograms.ArrayIsSortedOrNot;

public class ArrayIsSortedOrNot {
    public static boolean isArrayIsSorted(int[] array){
         int length=array.length;
         boolean flag=false;
         for(int i=0;i<length-1;i++){
            if(array[i]<array[i+1]){
                flag=true;
            }
            else{
                flag=false;
            }
         }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,9,15};
        if(isArrayIsSorted(arr)==true){
            System.out.print("Array is Sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
    }
}
