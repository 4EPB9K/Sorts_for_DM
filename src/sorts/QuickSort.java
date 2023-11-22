package sorts;

public class QuickSort {
    public static void quickSort(int[] array, int low, int N) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= N)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (N - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = N;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (N > i)
            quickSort(array, i, N);
    }

}
