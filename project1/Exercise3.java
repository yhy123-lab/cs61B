class PringMax1{
    public static int max(int[] m){
        int res = m[0];
        for (int i = 0; i < m.length;i = i + 1){
            if (m[i] > res){
                res = m[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int [] numbers = new int []{9,2,15,2,22,10,6};
        System.out.println(max(numbers));
    }
}
