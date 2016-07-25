package proc.stat;

import java.util.Arrays;

/**
 * Created by Eugene on 22.07.2016.
 */
public class ArrayInverter {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int i = 0; i < arr.length / 2; i++){
            swap(arr, i, arr.length-1-i);
        }
        System.out.println(Arrays.toString(arr));
    }

        private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

}
