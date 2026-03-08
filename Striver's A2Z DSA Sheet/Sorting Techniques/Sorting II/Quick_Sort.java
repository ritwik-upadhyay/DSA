public class Quick_Sort {
    public static void main(String[] args) {
        int[] a = {10, 7, 8, 9, 1, 5};
        quickSort(a,0,a.length-1);
        for(int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low-1;
        for(int j=low;j<high;j++) {
            if(a[j]<=pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        
        return i+1;
        
    }
    public static void quickSort(int[] a, int low, int high) {
        if(low<high) {
            int pivotIndex = partition(a,low,high);
            quickSort(a, low, pivotIndex-1);
            quickSort(a, pivotIndex+1, high);
        }
    }
}