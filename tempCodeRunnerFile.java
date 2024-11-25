import java.util.*;
public class Array {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 70;
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end) {

            int mid = (start + end) / 2;


            if(arr[mid] == target) {
                System.out.println("Target found at index " + mid);
                return;
            }

            if(target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println ("Target is not found in this array!");
    }
}