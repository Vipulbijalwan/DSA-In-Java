public class SingleLinkedList {

    private static Node head;
    private  static Node tail;

    private static class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(SingleLinkedList.Node next) {
            this.next = next;
        }

    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
        }
        tail.next = node;
        tail = tail.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    private static int findSquare(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = ans + rem * rem;
            num = num / 10;
        }
        return ans;
    }

    public static SingleLinkedList removeDup(SingleLinkedList list){
        Node temp= head.next;
        Node p= head;

        while (temp.next!=null){
            if(temp.val== p.val){
                temp=temp.next;
            } if(temp.val!= p.val){
                p.next=temp;
                p=p.next;
                p.val= temp.val;
                temp=temp.next;

            }
            p.next=null;
        }
        return list;
    }

//    public static Node marge(SingleLinkedList list1, SingleLinkedList list2) {
//
//
//        Node temp1 = list1.head;
//        Node temp2 = list2.head;
//
//
//        while (temp1 != null && temp2 != null) {
//            if (temp1.val <= temp2.val) {
//                temp3.val = temp1.val;
//                temp1 = temp1.next;
//            } else {
//                temp3.val = temp2.val;
//                temp2 = temp2.next;
//            }
//        }
//        while (temp1 != null) {
//
//            temp3.val = temp1.val;
//            temp1 = temp1.next;
//        }
//        while (temp2 != null) {
//
//            temp3.val = temp2.val;
//            temp2 = temp2.next;
//        }
//        return temp;
//    }

    //Recursion  reverse linked list
    public static void reverseList(Node node){
        if(node.next==null){
            head=tail;
            return;
        }
        reverseList(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    //reverse link list
    public static void reverse(SingleLinkedList list){
        Node c= head;
        Node p=null;
        Node n=null;
while (c!=null) {
    n=c.next;
    c.next = p;
    p = c;
   c=n;

}
    head=p;
    }
    public  static void removeElements(SingleLinkedList list, int val) {
        Node s= null;
        Node f=head;

        while(f!=null){
            if(f.val==val){

                s.next = f.next;
                f=f.next;
                s = f;

            }else{

                s=f;
                f=f.next;
            }
        }

    }
    //Mid of linkList

    public static void midOfLL(SingleLinkedList list){
        Node s=head;
        Node f=head;
        while (f.next!=null && f!=null){

            s=s.next;
            f=f.next.next;
        }
        head=s;
    }

    public static Node reverse2(Node head){
        Node p=null;
        Node c=head;
        Node n;

        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }

        return p;
    }
    public static int getDecimalValue(Node head) {
        Node temp = reverse2(head);
        System.out.println(head.val);
        int totalNum=0;
        int i=0;
        while(temp!=null){
            int num=temp.val;

            totalNum+=(int)Math.pow(2,i)*num;
            temp=temp.next;
            i++;

        }
        return totalNum;
    }

    //Adding to link list
//    public static Node sum(SingleLinkedList list1, SingleLinkedList list2){
//        Node ans=head;
//        Node temp=list1.head;
//        Node temp1=list1.head;
//        Node temp2=list2.head;
//        System.out.println("temp 1:"+temp1.val);
//        System.out.println("temp 2:"+temp2.val);
////        int carry=0;
////        while (temp1!=null && temp2!=null){
////            if(carry+temp1.val+temp2.val<10){
////                temp.val=temp1.val+temp2.val+carry;
////                temp=temp.next;
////                temp1=temp1.next;
////                temp2=temp2.next;
////                carry=0;
////            }else {
////                temp.val=(temp1.val+temp2.val+carry)%10;
////                temp1=temp1.next;
////                temp=temp.next;
////                temp2=temp2.next;
////                carry=1;
////            }
////        }
//return ans;
//
//
//    }
    public static void main(String[] args) {

        SingleLinkedList list1=new SingleLinkedList();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(6);
        list1.insertFirst(0);
        list1.display();
        System.out.println();
        SingleLinkedList list3=new SingleLinkedList();
        list3.insertFirst(0);
        list3.insertFirst(1);
        list3.insertFirst(3);
        list3.insertFirst(0);
        list3.display();
        System.out.println();
//        marge(list1,list3);
    }
}
