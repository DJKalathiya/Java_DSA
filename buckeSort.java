import java.util.*;

class buckeSort {
    public static void main(String[] args){
        float arr[] = { (float)0.897, (float)0.565,
            (float)0.656, (float)0.1234,
            (float)0.665, (float)0.3434 };

        int n = arr.length;
        busort(arr,n);

        System.out.println("Sorted array is : ");
        for(float el : arr){
            System.out.print(el + " ");
        }
    }
    static void busort(float arr[], int n){
        if(n<=0){
            return;
        }

        // 1. create n bucket 
        @SuppressWarnings("uchecked")
        Vector<Float>[] buckets = new Vector[n];

        for(int i=0; i<n; i++){
            buckets[i] = new Vector<Float>();

        }

        // 2. put element in buckets
        for(int i=0; i<n; i++){
            float idx = arr[i]*n;
            buckets[(int)idx].add(arr[i]);
        }

        // 3.sort individual buckets
        for(int i=0; i<n; i++){
            Collections.sort(buckets[i]);
        }

        // 4. concatente all buckets into0 arr[]
        int index = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<buckets[i].size(); j++){
                arr[index++] = buckets[i].get(j);
            }
        }
    }
}
