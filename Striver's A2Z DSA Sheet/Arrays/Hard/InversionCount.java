import java.util.*;

public class InversionCount {

    // Function to merge two halves and count inversions
    static int merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        int cnt = 0;

        // Merge and count inversions
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1); // inversion count
                right++;
            }
        }

        // Remaining elements
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return cnt;
    }

    // Merge Sort function
    static int mergeSort(int[] arr, int low, int high) {

        int cnt = 0;

        if (low >= high) return cnt;

        int mid = (low + high) / 2;

        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += merge(arr, low, mid, high);

        return cnt;
    }

    // Main function to count inversions
    static int numberOfInversions(int[] arr, int n) {
        return mergeSort(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;

        int count = numberOfInversions(arr, n);

        System.out.println("The number of inversions are: " + count);
    }
}
