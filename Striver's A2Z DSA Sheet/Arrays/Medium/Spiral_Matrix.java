import java.util.*;
public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Array:-");
        display(arr);
        System.out.println("Spiral Output:-");
        spiral(arr);
    }
    public static void spiral(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        while(top<=bottom && left<=right) {
            for(int i=left;i<=right;i++) {
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom;i>=top;i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
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