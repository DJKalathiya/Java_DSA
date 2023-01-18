// This is selection sort code in java
// smallest element is come first position 
class selectionSort{
    public static void main(String[] args){
        selectionSort ob = new selectionSort();
        int arr[] = {64,25,21,12,11};
        ob.printarray(arr);
        System.out.println("Sorting of array");
        ob.sort(arr);
        ob.printarray(arr);
    }

    void printarray(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    void sort(int arr[]){
        int length = arr.length;

        for(int i=0; i<length-1; i++){
            int minIndex = i;
            for(int j= i+1; j<length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex =j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
// time complexcity is O(n^2)