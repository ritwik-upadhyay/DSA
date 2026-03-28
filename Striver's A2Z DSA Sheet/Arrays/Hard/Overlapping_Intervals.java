import java.util.*;
public class Overlapping_Intervals 
{
    static int n;
    static int[][] arr;
    static List<List<Integer>> merged = new ArrayList<>();
    public static void main(String[] args) {
        input();
        merge();
        display();
    }
    public static void input() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of intervals: ");
        n = sc.nextInt();
        arr = new int[n][2];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
    }
    public static void merge() {
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        for(int[] i : arr) {
            if(merged.isEmpty() || merged.get(merged.size()-1).get(1)<i[0]) {
                merged.add(Arrays.asList(i[0],i[1]));
            }
            else {
                int last = merged.size()-1;
                int maxEnd = Math.max(merged.get(last).get(1),i[1]);
                merged.get(last).set(1,maxEnd);
            }
        }
    }
    public static void display() {
        System.out.println("Old Array:");
        System.out.print("[");
        for(int i=0;i<n;i++) {
            if(i==n-1) {
                System.out.print("[" + arr[i][0] + ", " + arr[i][1] + "]");
            } else {
                System.out.print("[" + arr[i][0] + ", " + arr[i][1] + "]" + ", ");
            }
        }
        System.out.println("]");
        System.out.println("New Merged Array:");
        System.out.println(merged);
    }
}