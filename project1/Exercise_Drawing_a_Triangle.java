class PrintF{
    public static void main(String [] args){
        int row = 0;
        int cow = 0;
        int Size = 5;
        while(row <= Size){
            cow = 0;
            while (cow < row){
                System.out.print("*");
                cow = cow + 1;
            }
            row = row + 1;
            System.out.println(" ");
        }
    }
}
