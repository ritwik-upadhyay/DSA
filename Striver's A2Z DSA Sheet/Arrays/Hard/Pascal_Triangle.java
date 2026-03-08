import java.util.*;
public class Pascal_Triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of N for Pascal's Triangle: ");
            int N = sc.nextInt();
            System.out.print("Enter the row: ");
            int r = sc.nextInt();
            System.out.print("Enter the column: ");
            int c = sc.nextInt();
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t THE PASCAL TRIANGLE\t\t\t\t\t\t\t\t");
            System.out.println("--------------------------------------------------------------------------------------");
            pascal(N,r,c);
        }
    }
    public static void pascal(int N, int r, int c) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for(int i=0;i<N;i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++) {
                row.set(j,triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            triangle.add(row);
        }
        
        for(List<Integer> row : triangle) {
            for(int val: row) {
                System.out.print(val);
            }
            System.out.println();
        }
        
         System.out.println("--------------------------------------------------------------------------------------");
         
         System.out.println("Nth row: "+triangle.get(N-1));
         
          System.out.println("--------------------------------------------------------------------------------------");
          
          System.out.println("Element at row "+r+" and "+" column "+c+": " + triangle.get(r-1).get(c-1));
          
           System.out.println("--------------------------------------------------------------------------------------");
    }
}