public class Bin_Search {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int k = 7;
        int r = bin(a, k);
        System.out.println(r);
    }
    public static int bin(int[] a, int k) {
        int l = a.length;
        int low = 0;
        int high = l-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[mid]<k) {
                low = mid+1;
            }
            else if(a[mid]>k) {
                high = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}