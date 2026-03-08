
import java.util.*;
public class Second_Max {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size: ");
            System.out.println();
            int n = sc.nextInt();
            if (n < 2) {
                System.out.println("No second largest element");
                return;
            }
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
            int max = Integer.MIN_VALUE;
            int smax = Integer.MIN_VALUE;
            for(int i=0;i<n;i++) {
                if(a[i]>max) {
                    smax = max;
                    max = a[i];
                }
                else if(a[i] < max && a[i]>smax) {
                    smax = a[i];
                }
            }
            if (smax == Integer.MIN_VALUE) {
                System.out.println("No second largest element");
            }
            else{
                System.out.print("Second Largest Element is " + smax);
            }
        }
    }
}
