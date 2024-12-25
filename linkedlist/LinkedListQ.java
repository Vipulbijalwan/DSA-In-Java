public class LinkedListQ {
    private  Node head;
    private   Node tail;

    private  class Node {

        int val;
        LinkedListQ.Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(LinkedListQ.Node next) {
            this.next = next;
        }

    }

    public void insertFirst(int val) {
        LinkedListQ.Node node = new LinkedListQ.Node(val);

        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {
        LinkedListQ.Node node = new LinkedListQ.Node(val);
        if (tail == null) {
            insertFirst(val);
        }
        tail.next = node;
        tail = tail.next;
    }

    public void display() {
        Node temp = head; // Start from the head
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next; // Move to the next node
        }
        System.out.print("End"); // Print the end marker
    }



//        public  Node marge(Node temp1, Node temp2) {
//
//        Node temp=head;
//        while (temp1 != null && temp2 != null) {
//            if (temp1.val <= .val) {
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

//    //Adding to link list
//    public void sumLinkL(LinkedListQ list1, LinkedListQ list2){
//
//      Node ans=new Node(0);
//        Node temp1=list1.head;//9
//        Node temp2=list2.head;//9
//        int carry=0;
//        while (temp1!=null && temp2!=null){
//
//            if(carry+temp1.val+temp2.val<10){
//                ans.val=temp1.val+temp2.val+carry;
//                temp1=temp1.next;
//                temp2=temp2.next;
//                ans=ans.next;
//                carry=0;
//            }else {
//                ans.val=(temp1.val+temp2.val+carry)%10;//8//9
//                temp1=temp1.next;
//                temp2=temp2.next;
//                ans=ans.next;
//                carry=1;
//            }
//        }
//
//
//        while (temp1!=null){
//            if(temp1.val+carry<10) {
//                ans.val = temp1.val + carry;
//
//                carry=0;
//                temp1=temp1.next;
//                ans=ans.next;
//            }else{
//                ans.val = (temp1.val + carry)%10;
//                carry=1;
//                temp1=temp1.next;
//                ans=ans.next;
//            }
//        }
//        while (temp2!=null){
//
//            if(temp2.val+carry<10) {
//
//                ans.val = temp2.val + carry;
//                carry=0;
//                temp2=temp2.next;
//                ans=ans.next;
//            }else{
//                ans.val = (temp2.val + carry)%10;
//                carry=1;
//                ans=temp2.next;
//                ans=ans.next;
//            }
//        }
//        if(carry==1){
//            Node extra=new Node(1);
//            ans.next=extra;
//            ans.val=extra.val;
//
//        }
//
//    }

    public  void removeLink(LinkedListQ list,int val){
       while (head.val == val){
           if(head.next==null){
               return;
           }
              head=head.next;
          }
        Node temp= head;
       Node next= head.next;
       while (next!=null){
           if(next.val==val){
               next=next.next;
           }else {
               temp.next=next;
               temp=next;
               next=next.next;
           }
       }
       temp.next=null;

       }

       public void addLinkList(LinkedListQ list1,LinkedListQ list2){
int carry=0;
Node temp1=list1.head;
Node temp2=list2.head;
LinkedListQ ans=new LinkedListQ();
ans.head=temp1;
while (temp1!=null && temp2!=null){
    int num= temp1.val+ temp2.val+carry;
    if(num>9){
        temp1.val=num%10;
        carry=1;
    }else {
        temp1.val=num;
        carry=0;
    }
    temp2=temp2.next;
    temp1=temp1.next;
}while (temp1!=null){
    int num= temp1.val+carry;
    if(num>9){
        temp1.val=num%10;
        carry=1;
    }else {
        temp1.val=num;
        carry=0;
    }
    temp1=temp1.next;
           }
           while (temp2!=null){
               temp1=temp2;
               int num= temp2.val+carry;
               if(num>9){
                   temp2.val=num%10;
                   carry=1;
               }else {
                   temp2.val=num;
                   carry=0;
               }
               temp1=temp1.next;
               temp2=temp2.next;
           }

       }






    }


