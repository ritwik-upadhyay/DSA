public class Repeating_Missing {
    public static void main(String[] args) {
        int[] a = {3,5,4,1,1};
        long n = a.length;
        long SN = (n*(n+1))/2;
        long SN2 = (n*(n+1)*(2*n+1))/6;
        long S = 0;
        long S2 = 0;
        for(int i=0;i<n;i++) {
            S += a[i];
            S2 += (long)a[i]*(long)a[i];
        }
        long val1 = S - SN;
        long val2 = S2 - SN2;
        val2 = val2/val1;
        long x = (val1+val2)/2;
        long y = x - val1;
        System.out.println("["+x+","+y+"]");
    }
}