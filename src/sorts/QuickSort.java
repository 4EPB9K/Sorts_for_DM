package sorts;

public class QuickSort {
    public static int count = 0;

    public static int quickSort(int[] array, int low, int N) {

        if (array.length == 0)
            return count;//завершить выполнение, если длина массива равна 0

        if (low >= N) {
            int countToSave = count;
            count = 0;
            return countToSave;//завершить выполнение если уже нечего делить
        }

        // выбрать опорный элемент
        int middle = low ;
        int opora = array[low];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = N;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
                count++;
            }

            while (array[j] > opora) {
                j--;
                count++;
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
        if (low < j) {
             quickSort(array, low, j);
        }

        if (N > i) {
            quickSort(array, i, N);
        }

        return count;
    }

}
