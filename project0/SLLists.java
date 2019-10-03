public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;
    public SLList(){
        sentinel = new IntNode(64,null);
        size = 0;
    }
    public SLList(int x){
        sentinel = new IntNode(64,null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }
    public void addFirst(int x){
       sentinel.next = new IntNode(x,sentinel.next);
       size = size + 1;
    }
    public int getFirst(){
        return sentinel.next.item;
    }
    public void addLast(int x){
        size += 1;
        IntNode p = sentinel;
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
    }
    private static int size(IntNode p){
        if (p.next == null){
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size(){
        return size(sentinel.next);
    }
    public static void main(String[] args){
//        SLList L = new SLList(15);
        SLList L = new SLList();
        L.addLast(20);
        System.out.println(L.size());
        System.out.println(L.getFirst());
    }

}
