import java.util.Scanner;
public class Move_Zero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            System.out.println();
            int[] a = new int[n];
            System.out.println("Enter elements: ");
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            moveZeroes(a);
            for(int i=0;i<n;i++) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
    public static void moveZeroes(int[] a) {
        int n = a.length;
        int slow = 0;
        for(int fast=0;fast<n;fast++) {
            if(a[fast] != 0) {
                int temp = a[fast];
                a[fast] = a[slow];
                a[slow] = temp;
                slow++;
            }
        }
    }
}