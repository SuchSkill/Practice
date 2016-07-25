package proc.stat;

import java.util.Arrays;

/**
 * Created by Eugene on 22.07.2016.
 */
public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        permute(arr, arr.length);


    }

    private static void permute(int[] arr, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arr));
        }else{
//            System.out.println(Arrays.toString(arr) + " process");
//            System.out.println(size);
            for (int i = 0; i < size; i++) {
                swap(arr, i, size - 1);

//                System.out.println(Arrays.toString(arr) + " before");
                permute(arr, size - 1);
                swap(arr, i, size - 1);
            }
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
