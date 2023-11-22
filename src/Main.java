import sorts.Determinant;
import sorts.InsertSort;

import java.util.Arrays;

import static sorts.QuickSort.quickSort;
import static sorts.Determinant.findDeterminant;
import static sorts.InsertSort.insertionSort;
import static sorts.SeqSearch.*;

public class Main {
    public static void main(String[] args) {
        int[] quick = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println("Было");
        System.out.println(Arrays.toString(quick));

        int low = 0;
        int N = quick.length - 1;

        quickSort(quick, low, N);
        System.out.println("Стало");
        System.out.println(Arrays.toString(quick));
        //____________________!!!____________________//
        int[][] matrix = {{1, 2, 10, 8, 0},
                {3, 4, 27, 4, 0},
                {12, 13, 65, 0, 666},
                {33, 0, 16, 19, 0},
                {3, 1, 14, 19, 0}};

        findDeterminant(matrix);
        System.out.println("Детерминант: " + Determinant.findDeterminant(matrix));
        System.out.println("____________________!!!____________________");
        //____________________!!!____________________//
        //int index = binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        int binaryIndex = binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 7);
        int seqIndex = SequentialSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10);
        int interpolationIndex = interpolationSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1);
        System.out.println("67 индекс: " + binaryIndex);
        System.out.println("Число сравнений бинарного поиск " + averageRavnoBinary(new int[]{1,2,3,4}));//ответ
        System.out.println("5 индекс последовательного поиска: " + seqIndex);
        System.out.println("Число сравнений послед поиск " + averageRavnoSeq(new int[]{2,3,1,4}));//ответ
        System.out.println("5 индекс: " + interpolationIndex);
        System.out.println("Число сравнений интерпол поиск " + averageRavnoInterpol(new int[]{1,2,4}));//ответ

        //____________________!!!____________________//
        int[] insertArray = insertionSort(new int[]{4, 1, 4, 5, 2, 6, 7, 3},0);
        int count = InsertSort.count(0);
        System.out.println("Новый массив: " + Arrays.toString(insertArray));
        System.out.println("Число сравнений: " + count);

        //____________________!!!____________________//
        /*int[] shelltArray = insertionSort(new int[]{4, 1, 4, 5, 2, 6, 7, 3},0);
        int countSheel = InsertSort.count(0);
        System.out.println("Новый массив: " + Arrays.toString(shelltArray));
        System.out.println("Число сравнений: " + countSheel);*/
    }
}