class PrintMax{
    public static int max(int[] m){
        int i = 0;
        int res = m[0];
        while (i < m.length){
            if (m[i] > res){
                res = m[i];
            }
            i = i + 1;
        }
        return res;
    }
    public static void main(String[] args){
        int [] numbers = new int []{9,2,15,2,22,10,6};
        System.out.println(max(numbers));
    }
}
