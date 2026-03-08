public class Stock {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int n = a.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<n;i++) {
            if(a[i]<min) {
                min = a[i];
            }
            else {
                max = Math.max(max, a[i]-min);
            }
        }
        System.out.println(max);
    }
}