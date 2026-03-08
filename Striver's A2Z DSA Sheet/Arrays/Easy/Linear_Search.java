import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int s = sc.nextInt();
            System.out.println();
            int[] a = new int[s];
            System.out.println("Enter elements: ");
            for(int i=0;i<s;i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter number to be searched: ");
            int n = sc.nextInt();
            int flag = 0;
            for(int i=0;i<s;i++) {
                if(a[i]==n) {
                    System.out.println("Element "+a[i]+" at " + i);
                    flag++;
                }
            }
            if(flag==0) {
                System.out.println("Element not found.");
            }
        }
    }
}