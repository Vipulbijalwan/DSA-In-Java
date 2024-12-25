public class Test {
    public static void main(String[] args) {

        LinkedListQ list1 = new LinkedListQ();



        list1.insertFirst(9);
        list1.insertFirst(9);

        list1.display();
        System.out.println();

        LinkedListQ list2 = new LinkedListQ();


        list2.insertFirst(9);


        list2.display();
        System.out.println();
        list1.addLinkList(list1,list2);
        list1.display();

    }
}
