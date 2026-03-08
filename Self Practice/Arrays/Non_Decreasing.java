
import java.util.*;
public class Non_Decreasing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size: ");
            System.out.println();
            int n = sc.nextInt();
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
            int flag = 0;
            for(int i=0;i<n-1;i++) {
                if(a[i]>a[i+1]) {
                     System.out.println("NO, not in non-decreasing order.");
                     flag++;
                     return;
                }
            }
            if(flag == 0)
            System.out.println("YES, in non-decreasing order.");
        }
    }
}