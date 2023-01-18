class Insetionsort {
    public static void main(String[] args){
        Insetionsort ob = new Insetionsort();
        int arr[] = {56,34,87,21,12};
        ob.printarray(arr);
        ob.sort(arr);
        System.out.println("sorting of array");
        ob.printarray(arr);
    }   
    void printarray(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 

    void sort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j= i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
