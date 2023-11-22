package sorts;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.swap;

public class ShellSort {
    public static ArrayList<Integer> shellSort(ArrayList<Integer> arr, int n) {
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i+= 1) {

                int temp = arr.get(i);
                int j;
                for (j = i; j >= gap && arr.get(j-gap) > temp; j -= gap)
                    arr.set(j,arr.get(j-gap));
                arr.set(j,temp);
            }
        }
        return arr;
    }
}