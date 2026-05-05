public class Ceil_To_Floor {
    public static void main(String[] args) {
        int[] a = {3,4,4,7,8,10};
        int x = 5;
        int l = a.length;
        int ansCeil = binCeil(a,l,x);
        int ansFloor = binFloor(a,l,x);
        System.out.println(a[ansFloor]+" "+a[ansCeil]);
    }
    public static int binCeil(int[] a, int l, int x) {
        int low = 0;
        int high = l-1;
        int ans = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[mid]>=x) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static int binFloor(int[] a, int l, int x) {
        int low = 0;
        int high = l-1;
        int ans = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[mid]<=x) {
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
}