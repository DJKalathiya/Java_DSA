class mergeSort {
    
    void merge(int arr[], int left, int mid, int right){
        // find two size of subarray
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // temp array 
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        // copy data into temp array
        for(int i=0; i<n1; i++){
            L[i] = arr[left+i];
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[mid+1+j];
        }

        // Merge the array

        // Initialize subarray
        int i=0,j=0;

        // initial array of merge array 
        int k=left;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }   
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // copy remaining element of left
        while(i<n1){
            arr[k] = L[i];
                i++;
                k++;
        }
        // copy remaining element of right
        while(j<n2){
            arr[k] = R[j];
                j++;
                k++;
        }
    }

    // main function that sort array 
    void sort(int arr[], int left, int right){
        if (left<right){
            int mid = left + (right - left)/2;

            sort(arr,left,mid);
            sort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }

    static void printarray(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        int arr[] = {45,67,43,76,21,34,89};
        System.out.println("Given array is : ");
        printarray(arr);

        mergeSort ob = new mergeSort();
        ob.sort(arr,0,arr.length-1);

        System.out.println("after sorting : ");
        printarray(arr);
    }   
}
// time complexcity is O(n log(n))
// This sort is i not understand litle bit.
