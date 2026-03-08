
import java.util.*;
public class Move_Zeroes {
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
            int slow = 0;
            for(int fast=0;fast<n;fast++) {
                if(a[fast]!=0) {
                    int temp = a[fast];
                    a[fast] = a[slow];
                    a[slow] = temp;
                    slow++;
                }
            }
            System.out.print("Changed Array is ");
            for(int i=0;i<n;i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
