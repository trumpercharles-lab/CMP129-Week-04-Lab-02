public class SortingBenchmarks {

    // Function to implement bubble sort
    public static int bubbleSort(int arr[]) {
        int exchanges=0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    exchanges++;
                }
            }
        }

        return exchanges;
    }

    public static void main(String args[]){
        int[] ArrayOne={1,4,3,2,5};
        int[] ArrayTwo={0,0,0,0,0};
        for(int c=1;c<=ArrayOne.length;c++){
            ArrayTwo[c-1]=ArrayOne[c-1];
        }

        System.out.print(bubbleSort(ArrayTwo));
    }
}
