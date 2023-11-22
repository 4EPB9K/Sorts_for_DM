package sorts;

import com.sun.tools.javac.Main;

public class InsertSort {
    public static int[] insertionSort(int[] array,int count) {
        //int count = 0;
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
                count(0);
                //count++;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
        }
        //System.out.println(count);
        return array;
    }
    public static int count(int count){
        int answer = count;
        //count++;
        return answer;
    }
}
