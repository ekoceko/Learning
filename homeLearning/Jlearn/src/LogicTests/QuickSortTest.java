package LogicTests;

public class QuickSortTest {
    public static void main(String args[]) {
        int[] input = {9,1,3,3,1,3,5,76,8,9,345,123,4,1,2,34,4,53,3};
        //int[] input = {6, 5, 2, 6, 1};
        quickSort(input);
        printArray(input,0,input.length-1);
    }
    private static void quickSort(int[] inputArray){
        int low = 0;
        int high = inputArray.length-1;
        sort(inputArray,low,high);
    }
    private static void sort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }
        int partitionIndex = partition(arr,low,high);
        sort(arr,low,partitionIndex);
        sort(arr,partitionIndex+1, high);
    }
    private static int partition(int[] arr, int low, int high){
        int leftPointer = low;
        int rightPointer = high;
        int pivot = arr[low];

        while (true){
            while (arr[leftPointer]<pivot){
                leftPointer++;
            }
            while (arr[rightPointer]> pivot){
                rightPointer--;
            }
            if (leftPointer>=rightPointer) {
                printArray(arr,low,high);
                return rightPointer;
            }
            swap(arr, leftPointer,rightPointer);
            leftPointer++;
            rightPointer--;
        }
    }
    private static void swap(int[] array, int left,int right){
        int tempValue = array[left];
        array[left] = array[right];
        array[right] = tempValue;

    }

    private static void printArray(int[] input, int low, int high){
                for (int i = low; i<=high;i++){
            System.out.print(input[i]+":");
        }
        System.out.println();;
    }
}
