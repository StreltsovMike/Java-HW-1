package HomeWork_1;

public class heapsort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 99, -13, 43, 0, 12};

        heapSort(arr);

        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    private static void heapSort(int []arr) {
        int n = arr.length;
        for(int i = n / 2 - 1; i >= 0; i-- )
            heapify(arr, i, n);
        

        for(int i = n - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }
    private static void heapify(int[] arr, int i, int n) {
          int leftNumrer = i * 2 +1;
          int rightNumber = i * 2 + 2;
          int largest = i;
          
          if(leftNumrer < n && arr[leftNumrer] > arr[largest])
            largest = leftNumrer;
          if(rightNumber < n && arr[rightNumber] > arr[largest])
            largest = rightNumber;

          if(i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);
          }

    }
    
}
