class BreakContinue{
    public static int windowPosSUm(int[] a, int n){
        for (int i = 0; i < a.length; i = i + 1){
            int sum = 0;
            if (i == 2){
                continue;
            }
            else{
                for (int j = i; j < i + n; j = j + 1) {
                    if (j < a.length) {
                        sum = sum + a[j];
                    } else {
                        break;
                    }
                }
            }
            a[i] = sum;
        }
        return a[0];
    }
    public static void main(String[] args){
        int[] a = {1,2,-3,4,5,4};
        int n = 3;
        windowPosSUm(a,n);
        System.out.println(java.util.Arrays.toString(a));
    }
}
