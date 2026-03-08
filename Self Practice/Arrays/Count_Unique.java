
import java.util.*;
public class Count_Unique {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size: ");
            System.out.println();
            int n = sc.nextInt();
            if(n==0) {
                System.out.println("No. of unique elements = " + n);
                return;
            }
            int[] a = new int[n];
            System.out.println("Enter Elments below in a sorted manner:");
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Array is ");
            for(int i=0;i<n;i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            int slow = 0;
            for(int fast = 1;fast < n;fast++) {
                if(a[slow]!=a[fast]) {
                    slow++;
                    a[slow] = a[fast];
                }
            }
            System.out.println("No. of unique elements = " + (slow + 1));
        }
    }
}