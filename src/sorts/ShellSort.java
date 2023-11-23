package sorts;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.swap;

public class ShellSort {
    public static int sort(int arrayToSort[]) {
        int count = 0;
        int s = 0;
        int n = arrayToSort.length;

        for (int gap = 1; gap > 0; gap = 2 * gap + 1, s++) {
            if (s >= Math.floor(Math.log(n))) return count;
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    count++;
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
        return count;
    }
}