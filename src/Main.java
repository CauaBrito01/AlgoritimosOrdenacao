public class Main {

    public static void main(String[] args) {
        int[] arr = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nSorting using Bubble Sort:");
        BubbleSort.sort(arr.clone());

        System.out.println("\nOriginal Array:");
        printArray(arr);

        System.out.println("\nSorting using Insertion Sort:");
        InsertionSort.sort(arr.clone());

        System.out.println("\nOriginal Array:");
        printArray(arr);

        System.out.println("\nSorting using Quick Sort:");
        QuickSort.sort(arr.clone());
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
