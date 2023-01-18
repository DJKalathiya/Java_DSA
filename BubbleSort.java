// This is bubble sort code
// This is not suitable for large data
class BubbleSort{
    public static void main(String[] args){
        BubbleSort ob = new BubbleSort();
        int arr[] = {5,4,3,2,1};
        ob.printarray(arr);
        ob.sort(arr);
        System.out.println("Sorting");
        ob.printarray(arr);
    }

    void printarray(int a[]){
        int len = a.length;
        for(int i=0; i<len; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    void sort(int a[]){
        int n = a.length;
        for(int i=0; i<n-1;i++){
            for(int j=0; j<n-1-i; j++){
                // compare two element and if large element swap it
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
// Time complexcity of this sort is O(n^2)
// Space complexcity of this sort is O(1)