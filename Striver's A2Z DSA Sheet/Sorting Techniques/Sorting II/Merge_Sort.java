import java.util.*;
public class Merge_Sort {
    public static void main(String[] args) {
        int[] a = {7,4,1,5,3};
        int low = 0;
        int high = a.length - 1;
        mergeSort(a,low,high);
        for (int num : a)
            System.out.print(num + " ");
        System.out.println();
    }
    public static void mergeSort(int[] a, int low, int high) {
        if(low>=high) {
            return;
        }
        int mid = (low + high)/2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a,low,mid,high);
    }
    public static void merge(int[] a, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid+1;
        while(left<=mid && right<=high) {
            if(a[left]<=a[right]) {
                temp.add(a[left++]);
            }
            else {
                temp.add(a[right++]);
            }
        }
        while(left<=mid) {
            temp.add(a[left++]);
        }
        while(right<=high) {
            temp.add(a[right++]);
        }
        for(int i=low;i<=high;i++) {
            a[i] = temp.get(i-low);
        }
    }
}