public class Main {

    public static void main(String[] args) {
        int[] arr = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array Original:");
        printArray(arr);

        System.out.println("\nBubble Sort:");
        BubbleSort.sort(arr.clone());

        System.out.println("\nArray Original:");
        printArray(arr);

        System.out.println("\nInsertion Sort:");
        InsertionSort.sort(arr.clone());

        System.out.println("\nArray Original:");
        printArray(arr);

        System.out.println("\nQuick Sort:");
        QuickSort.sort(arr.clone());
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
