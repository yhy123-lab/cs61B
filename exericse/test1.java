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
