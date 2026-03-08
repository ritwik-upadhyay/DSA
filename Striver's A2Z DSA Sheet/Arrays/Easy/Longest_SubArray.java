public class Longest_SubArray {
    public static void main(String[] args) {
        int[] a = {10,5,2,7,1,9};
        int k = 15;
        int n = a.length;
        int maxLen = 0;
        int left = 0;
        int right = 0;
        int sum = a[0];
        while(right<n) {
            while(left<=right && sum>k) {
                sum -= a[left];
                left++;
            }
            if(sum==k) {
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            if(right<n) {
                sum += a[right];
            }
        }
        System.out.println(maxLen);
    }
}