import java.util.Arrays;

class radixSort {
    public static void main(String[] args) {
        int arr[] = { 13, 65, 45, 34, 87, 98, 43 };
        int n = arr.length;

        radixsort(arr, n);
        print(arr, n);
    }

    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // utility function to get maximum value in arr[]
    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    // A function to do counting sort of arr[]
    // according to the digit represented by exp.
    static void countsort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // stores count of occurance in count[]
        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // change count[i]
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // copy the output array into arr[]
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // the main function to sort array
    static void radixsort(int arr[], int n) {
        // find the maximum number
        int m = getMax(arr, n);

        // Do counting sort for every digit
        for (int exp = 1; m / exp > 0; exp *= 10) {
            countsort(arr, n, exp);
        }
    }
}
