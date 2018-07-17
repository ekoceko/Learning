package LogicTests;

import java.util.Arrays;

public class TestQS {

    public static void main(String[] args) throws Exception {
        int[] input = {9,1,3,3,1,3,5,76,8,9,345,123,4,1,2,34,4,53,3};
        quicksort(input, 0, input.length - 1);
        System.out.println(Arrays.toString(input));
    }

    private static void quicksort(int[]a, int lo, int hi) {
        if (lo < hi) {
            int q = hoare_partition(a, lo, hi);
            quicksort(a, lo, q);
            quicksort(a, q + 1, hi);
        }
    }

    private static int hoare_partition(int[] a, int lo, int hi) {
        int pivot = a[lo];
        int i = lo;
        int j = hi;

        while (true) {

            while (a[i] < pivot) i++;

            while (a[j] > pivot) j--;

            if (i >= j) {
                return j;
            }
            swap(a, i, j);
            i++;
            j--;

        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
