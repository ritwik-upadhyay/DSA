
import java.util.*;
public class Rotate_Array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            System.out.println();
            System.out.print("Enter number of positions k: ");
            int k = sc.nextInt();
            System.out.println();
            if(n==0) {
                System.out.println("No elements so no rotation");
                return;
            }
            k = k%n;
            int[] a = new int[n];
            System.out.println("Enter Elments below:");
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Array is ");
            for(int i=0;i<n;i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            reverse(a,0,n-1);
            System.out.print("Reversed Array is ");
            for(int i=0;i<n;i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            reverse(a,0,k-1);
            reverse(a,k,n-1);
            System.out.print("Rotated Array is ");
            for(int i=0;i<n;i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
