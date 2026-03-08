public class Dutch_National_Flag {
    public static void main(String[] args) {
        int[] a = {1,0,2,1,0};
        int n = a.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high) {
            if(a[mid]==0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid]==1) {
                mid++;
            }
            else {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
        for(int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}