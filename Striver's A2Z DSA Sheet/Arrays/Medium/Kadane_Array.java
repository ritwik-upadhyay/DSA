public class Kadane_Array {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, -2, 7, -4};
        int n = a.length;
        int sum = 0;
        int max = 0;
        int ansStart = -1;
        int start = 0;
        int ansEnd = -1;
        for(int i=0;i<n;i++) {
            sum += a[i];
            if(sum==0) {
                start = i;
            }
            if(sum>max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        for(int i=ansStart;i<=ansEnd;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(max);
    }
}