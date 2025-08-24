package ArrayPrograms.ArrayIsSortedOrNot;

public class ArrayIsSortedOrNot {

    public static boolean isArrayIsSorted(int[] array){
        int arrayLength=array.length - 1;
        for (int i = 0; i < arrayLength ; i++) {
            if (array[i] > array[i + 1]) {
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,9,18,100,200,2};
        if(isArrayIsSorted(arr)==true){
            System.out.print("Array is Sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
    }
}
