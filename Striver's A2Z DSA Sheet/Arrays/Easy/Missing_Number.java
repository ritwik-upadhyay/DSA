public class Missing_Number {
    public static void main(String[] args) {
        int[] a = {1,2,4,5};
        int n = 5;
        int sum1 = (n * (n+1))/2;
        int sum2 = 0;
        for(int i : a) {
            sum2 = sum2 + i;
        }
        System.out.println(sum1-sum2);
    }
}