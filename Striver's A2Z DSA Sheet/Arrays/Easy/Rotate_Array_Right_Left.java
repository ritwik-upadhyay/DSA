import java.util.Scanner;
public class Rotate_Array_Right_Left {
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
            System.out.print("Enter the number of elements to rotate: ");
            int k = sc.nextInt();
            System.out.println();
            System.out.print("Enter the direction: ");
            String d = sc.next();
            if(d.equals("right") || d.equals("left")) {
                System.out.println("Valid Direction!");
            }
            else {
                System.out.println("Invalid Direction! Try Again.");
                return;
            }
            rotate(a,k,d);
            for(int i=0;i<n;i++) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
    public static void rotate(int[] a, int k, String d) {
        int n = a.length;
        int left = 0;
        int right = n-1;
        reverse(a,left,right);
        if(d.equals("right")) {
            reverse(a,0,k-1);
            reverse(a,k,n-1);
        }
        else {
            reverse(a,0,n-k-1);
            reverse(a,n-k,n-1);
        }
    }
    public static void reverse(int[] a, int left, int right) {
        while(left<right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}