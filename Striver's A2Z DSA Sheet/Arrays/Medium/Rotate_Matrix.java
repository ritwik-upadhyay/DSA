public class Rotate_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Array:-");
        display(arr);
        rotate(arr);
        System.out.println("Rotated Array:-");
        display(arr);
    }
    public static void rotate(int[][] arr) {
        transpose(arr);
        reverse(arr);
    }
    public static void transpose(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverse(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            reverseArray(arr[i]);
        }
    }
    public static void reverseArray(int[] a) {
        int l=0;
        int r=a.length-1;
        while(l<r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
    public static void display(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}