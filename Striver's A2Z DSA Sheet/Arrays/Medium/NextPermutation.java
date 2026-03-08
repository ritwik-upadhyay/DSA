public class NextPermutation {
    public static void main(String[] args) {
        int[] a = {1,3,2};
        nextPermutation(a);
        for(int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void nextPermutation(int[] a) {
        int n = a.length;
        int index = -1;
        for(int i=n-2;i>=0;i--) {
            if(a[i]<a[i+1]) {
                index = i;
                break;
            }
        }
        if(index==-1) {
            reverse(a, 0, n-1);
            return;
        }
        for(int i=n-1;i>index;i--) {
            if(a[i]>a[index]) {
                swap(a,i, index);
                break;
            }
        }
        reverse(a, index+1, n-1);
    }
    public static void reverse(int[] a, int start, int end) {
        while(start<end) {
            swap(a,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] a,int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}