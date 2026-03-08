public class Kadane {
    public static void main(String[] args) {
        int[] a = {-2, -3, -7, -2, -10, -4};
        int n = a.length;
        long sum = 0;
        long max = Long.MIN_VALUE;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i=0;i<n;i++) {
            sum = sum + a[i];
            if(sum>max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum==0) {
                start = i;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        System.out.println(max);
        for(int i=ansStart;i<=ansEnd;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}