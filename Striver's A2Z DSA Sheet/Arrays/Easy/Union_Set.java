import java.util.*;
public class Union_Set {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {2, 3, 4, 4, 5, 11, 12};
        int n = a.length;
        int m = b.length;
        List<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        while(i<n && j<m) {
            if(a[i]<b[j]) {
                if(Union.isEmpty() || Union.get(Union.size()-1)!=a[i]) {
                    Union.add(a[i]);
                }
                i++;
            }
            else if(a[i]>b[j]) {
                if(Union.isEmpty() || Union.get(Union.size()-1)!=b[j]) {
                    Union.add(b[j]);
                }
                j++;
            }
            else {
                if(Union.isEmpty() || Union.get(Union.size()-1)!=a[i]) {
                    Union.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n) {
             if(Union.isEmpty() || Union.get(Union.size()-1)!=a[i]) {
                    Union.add(a[i]);
                }
                i++;
        }
        while(j<m) {
             if(Union.isEmpty() || Union.get(Union.size()-1)!=b[j]) {
                    Union.add(b[j]);
            }
            j++;
        }
        for(int v : Union) {
            System.out.print(v+" ");
        }
        System.out.println();
    }
            
}