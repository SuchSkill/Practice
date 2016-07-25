package proc.stat;

import java.io.BufferedReader;
import java.util.Arrays;

/**
 * Created by Eugene on 22.07.2016.
 */
public class MergeArrays {
    public static void main(String[] args) {
        int[] LeftArr = {1};
        int[] RightArr = {2};
        int[] Result = new int[LeftArr.length+RightArr.length];
        int i = 0;
        int j = 0;
        while(i < LeftArr.length && j < RightArr.length) {
            if (LeftArr[i] > RightArr[j]) {
                Result[i + j] = RightArr[j];
                j++;
            } else {
                Result[i + j] = LeftArr[i];
                i++;
            }
        }
        if(i == LeftArr.length && j == RightArr.length){
            return;
        }
        else if(j == RightArr.length){
            System.arraycopy(LeftArr, i, Result, i+j, LeftArr.length-i );
        }
        else if(i == LeftArr.length){
            System.arraycopy(RightArr, j, Result, i+j, RightArr.length-j );
        }
        System.out.println(Arrays.toString(Result));
    }




}
