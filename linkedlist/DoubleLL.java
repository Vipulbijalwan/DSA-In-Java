public class DoubleLL {
    private Node head;
    private Node tail;
    public class Node {

        private int val;
        private Node next;
        private Node prev;

        public Node() {
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node node) {
            this.val=val;
        }
    }



    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null) {
            head.prev = node.next;
        }
        head=node;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val +" -> ");
            temp=temp.next;

        }
        System.out.print("END");
    }
    public void insertLast(int val){
        Node node=new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
    }

    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);

            return temp;
        }
      node.next=  insertRec(val, index-1, node.next);
   return node;
    }



    public void insertMid(int val,int index){
        int i=1;
        Node node=new Node(val);
        Node temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;

    }

    }

