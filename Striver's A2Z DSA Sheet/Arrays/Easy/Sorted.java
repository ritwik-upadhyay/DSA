public class Sorted {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,5};
        int flag = 0;
        int n = a.length;
        for(int i=0;i<n-1;i++) {
            if(a[i]>a[i+1]) {
                System.out.println("False");
                flag++;
                return;
            }
        }
        if(flag==0) 
        System.out.println("True");
    }
}