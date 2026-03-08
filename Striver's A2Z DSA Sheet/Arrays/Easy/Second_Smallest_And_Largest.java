public class Second_Smallest_And_Largest {
    public static void main(String[] args) {
        int[] a = {2,5,3,1,0};
        int max = Integer.MIN_VALUE;
        int min = a[0];
        int smin = a[0];
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i]>max) {
                smax = max;
                max = a[i];
            }
            else if(a[i]<max && a[i]>smax) {
                smax = a[i];
            }
            if(a[i]<min) {
                smin = min;
                min = a[i];
            }
            else if(a[i]>min && a[i]<smin) {
                smin = a[i];
            }
        }
        if(smax == Integer.MIN_VALUE || smin == a[0]) {
            System.out.println(-1);
            return;
        }
        System.out.println(smax);
        System.out.println(max);
        System.out.println(smin);
        System.out.println(min);
    }
}