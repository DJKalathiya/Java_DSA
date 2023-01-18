class quickSort {
    // This function take last element as pivot element 
    // and make left of pivot element smaller and right side is 
    // greater element

    static int partition(int arr[], int low , int high){
        // pivot
        int pivot = arr[high];

        // indicate of smaller element 
        int i = (low-1);
        for(int j=low; j<=high-1; j++){
            // IF current element is smaller than pivot
            if(arr[j] < pivot){

                // incerment smaller index
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    // The main function for quicksort
    // arr[] - array of sorted
    // low - starting point
    // hight - ending point
    static void sort(int arr[], int low, int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);

            sort(arr, low,partitionIndex-1);
            sort(arr, partitionIndex+1, high);
        }
    }
    public static void main(String[] args){
        int arr[] = {65,36,34,76,98,2,78};
        int n = arr.length;
        System.out.println("This is array : ");
        printarray(arr);

        sort(arr,0,n-1);
        System.out.println("sorted array is : ");
        printarray(arr);

    }
    static void printarray(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
// worst case time complexcity is O(n^2)
