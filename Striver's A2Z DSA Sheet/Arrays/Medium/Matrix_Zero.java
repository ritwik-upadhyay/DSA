public class Matrix_Zero {
    public static void main(String[] args) {
        int[][] a = {{1,1,1},{1,0,1},{1,1,1}};
        int m = a.length;
        int n = a[0].length;
        boolean fRz = false;
        boolean fCz = false;
        for(int i=0;i<m;i++) {
            if(a[i][0]==0) {
                fRz = true;
                break;
            }
        }
         for(int j=0;j<n;j++) {
            if(a[0][j]==0) {
                fCz = true;
                break;
            }
        }
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                if(a[i][j]==0) {
                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                if(a[i][0]==0 || a[0][j]==0) {
                    a[i][j] = 0;
                }
            }
        }
        if(fRz) {
            for(int j=0;j<n;j++) {
                a[0][j] = 0;
            }
        }
        if(fCz) {
            for(int i=0;i<m;i++) {
                a[i][0] = 0;
            }
        }
        for(int[] v : a) {
            for(int l : v) {
                System.out.print(l+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}