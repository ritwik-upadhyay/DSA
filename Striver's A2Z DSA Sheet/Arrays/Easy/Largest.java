public class Largest {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,0};
        int max = a[0];
        for(int n : a) {
            if(n>max) {
                max = n;
            }
        }
        System.out.println(max);
    }
}