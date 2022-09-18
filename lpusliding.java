public class lpusliding {
    // Method to find the maximum for
    // each and every contiguous
    // subarray of size k.
    static void printKMax(int arr[], int n, int k) {
        int j, max, maxval;

        for (int i = 0; i <= n - k; i++) {

            max = countones(arr[i]);
            maxval = arr[i];

            for (j = 1; j < k; j++) {
                if (countones(arr[i + j]) >= max) {
                    maxval = arr[i + j];
                    max = countones(arr[i + j]);
                }
            }
            System.out.print(maxval + " ");
        }
    }

    static int countones(int n) {
        int count = 0;
        int num=n;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        // System.out.println(count+" of "+num);
        return count;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;
        printKMax(arr, arr.length, k);
    }
}
