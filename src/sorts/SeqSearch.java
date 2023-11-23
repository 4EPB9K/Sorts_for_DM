package sorts;

public class SeqSearch {
    public static int interpolationSearch(int[] integers, int elementToSearch) {

        int startIndex = 0;
        int lastIndex = (integers.length - 1);
        int count = 0;

        while ((startIndex < lastIndex) && (elementToSearch >= integers[startIndex]) &&
                (elementToSearch <= integers[lastIndex])) {
            // используем формулу интерполяции для поиска возможной лучшей позиции для существующего элемента
            int pos = startIndex + (((lastIndex - startIndex) /
                    (integers[lastIndex] - integers[startIndex])) *
                    (elementToSearch - integers[startIndex]));

            if (integers[pos] == elementToSearch)
                return count;//pos

            if (integers[pos] < elementToSearch)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        return count;
    }
    public static double averageRavnoInterpol(int[] arr) {
        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            count += interpolationSearch(arr, arr[i - 1]);
        }
        return (double) count / arr.length;
    }

    public static int SequentialSearch(int[] arr, int input) {
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            position++;
            if (arr[i] == input) {
                break;
            }
            if (i == arr.length - 1) {
                position = arr.length - 1;
            }

        }
        return position;
    }

    public static double averageRavnoSeq(int[] arr) {
        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            count += SequentialSearch(arr, arr[i - 1]);
        }
        return (double) count / arr.length;
    }

    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int count = 0;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            count++;
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return count;//middleIndex
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return count;
    }

    public static double averageRavnoBinary(int[] arr) {
        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            count += binarySearch(arr, arr[i - 1]);
        }
        return (double) count / arr.length;
    }

    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

}
