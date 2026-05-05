public class Binary_Search_Insert {
    public static void main(String[] args) {
        int[] a = {1,2,4,7};
        int x = 6;
        int l = a.length;
        int low = 0;
        int high = l-1;
        int ans = l;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[mid]>=x) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
