package s2;

public class LinkedList {
    Node root;
    private int size;

    public int getSize() {
        return size;
    }

    public  void add(int value){
        if (root == null){
            root = new Node(value);
            size = 1;
            return;
        }

        Node currentNode = root;
        while (currentNode.next != null)
            currentNode = currentNode.next;

        currentNode.next = new Node(value);
        size++;
    }

    public boolean remove(int value){

        if (root.value == value){
            root = root.next;
            size--;
            return true;
        }

        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next;
                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    private Node getNode(int index){
        Node currentNode = root;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    public void print(){
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    private class Node {
        int value;
        Node next;

        public Node(){}

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
