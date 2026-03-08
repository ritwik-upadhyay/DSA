class Appear_Once {
    public static void main(String[] args) {
        int[] a = {4,1,2,1,2};
        int xor = 0;
        for(int n : a) {
            xor ^= n;
        }
        System.out.println(xor);
    }
}