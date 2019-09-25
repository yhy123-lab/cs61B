class Books{
    String title;
    String author;
}
class BooksTestDrive {
    public static void main(String[] args){
        Books [] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "a";
        myBooks[1].title = "b";
        myBooks[2].title = "c";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "ian";

        while (x < 3){
            System.out.print(myBooks[x].title);
            System.out.print("By");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}

class Hobbits{
    String name;
    public static void main(String[] args){
        Hobbits [] h = new Hobbits[5];
        int z = 0;
        while (z < 4){
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1){
                h[z].name = "frodo";
            }
            if (z == 2){
                h[z].name = "sam";
            }
            System.out.print(h[z].name + "is a");
            System.out.println("good Hobbit name");
        }
     }
}

class Testarrays{
    public static void main(String [] args){
        String [] islands = new String[4];
        int [] index = new int[4];
        int y = 0;
        int ref;
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "cozumel";
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        while (y < 4){
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
class Triangle{
    double area;
    int height;
    int length;
    void setArea(){
        area = (height * length)/2;
    }
    public static void main(String [] args){
        Triangle [] ta = new Triangle[4];
        int x = 0;
        while (x < 4){
            ta[x] = new Triangle();
            ta[x].height = (x + 1)*2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle "+x+",area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x =27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(",t5 area = " + t5.area);
    }
}
