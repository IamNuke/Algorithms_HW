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

    public void swap(int index1, int index2){
        if (index1 < 0 || index1 >= size || index2 < 0 || index2 >= size){
            return;
        }
        Node node1 = null, node2 = null, currentNode = root;
        for (int i = 0; currentNode != null; i++) {

            if (node1 == null)
                if (index1 == i)
                    node1 = currentNode;
            if (node2 == null)
                if (index2 == i)
                    node2 = currentNode;
            if (node1 != null && node2!=null)
                break;
            currentNode = currentNode.next;
        }

        int temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }

    public void revert(){
       if (root != null && root.next != null){
           revert(root.next, root);
       }
    }
    public void revert(Node currentNode, Node previouseNode){

        if (currentNode.next == null){
            root = currentNode;
        }else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previouseNode;
        previouseNode.next = null;

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
