public class CircularLL {

    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public  void display(){
        Node node=head;
        while(head!=tail){
            System.out.print(head.val +" -> ");
            head=head.next;
        }
        System.out.println("End");
    }

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
