class heapSort {
    public static void main(String[] args) {
        int arr[] = { 45, 32, 87, 55, 69, 2, 1, 65 };

        heapSort ob = new heapSort();
        printarray(arr);

        System.out.println("Sorted heap is : ");
        ob.sort(arr);
        printarray(arr);

    }

    static void printarray(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // If left is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // if right child is larger than root
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // IF largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
// Time comlexcity of this sort is : N log(n)
// space complexcity is : O(1)