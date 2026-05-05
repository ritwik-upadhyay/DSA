public class Count_Occurrences {
    public static void main(String[] args) {
        int[] a = {3, 4, 13, 13, 13, 20, 40};
        int x = 13;
        int l = a.length;
        int low = 0;
        int high = l-1;
        int ansf = -1;
        int ansl = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[mid]==x) {
                ansl = mid;
                low = mid+1;
            }
            else if(a[mid]>x) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        low = 0;
        high = l-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(a[mid]==x) {
                ansf = mid;
                high = mid-1;
            }
            else if(a[mid]>x) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        int c = (ansf==-1)?0:(ansl-ansf+1);
        System.out.println(c);
    }
}
