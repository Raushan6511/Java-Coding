package ArrayPrograms.RemoveDuplicateElement;

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 2, 3, 4, 4, 5};
        // int arrayLength = arr.length;

        // int[] temp = new int[arrayLength];
        // int j = 0;

        // for (int i = 0; i < arrayLength; i++) {
        //     boolean found = false;
        //     for (int k = 0; k < j; k++) {
        //         if (arr[i] == temp[k]) {
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (!found) {
        //         temp[j++] = arr[i];
        //     }
        // }

        // System.out.print("Unique Array: ");
        // for (int i = 0; i < j; i++) {
        //     System.out.print(temp[i] + " ");
        // }

        int[] arr = {1, 2, 9, 3, 4, 4, 5,6,9};
        int[] unique = Arrays.stream(arr).distinct().toArray();

        System.out.print("Unique Array: ");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
        
    }
}
