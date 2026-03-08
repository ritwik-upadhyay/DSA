

public class Array_Reverse1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int l = a.length;
        for(int i=0;i<l;i++) {
            System.out.print(a[i] + " ");
        }
        for(int i=0;i<l/2;i++) {
            int temp = a[i];
            a[i] = a[l-i-1];
            a[l-i-1] = temp;
        }
        System.out.println();
        for(int i=0;i<l;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
