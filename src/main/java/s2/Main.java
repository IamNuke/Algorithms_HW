package s2;

public class Main {

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.add(8);
        list1.add(4);
        list1.add(9);
        list1.add(6);
        list1.add(1);

        list1.print();
        list1.revert();
        list1.print();

    }
}


