package s3;

public class Main {
    public static void main(String[] args) {
        BinTree<Integer> tree = new BinTree<>();

        tree.add(5);
        tree.add(1);
        tree.add(9);
        tree.add(8);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(2);
        tree.add(20);
        tree.add(31);
        tree.add(30);

        tree.print();

        tree.remove(20);

        tree.print();
    }
}
