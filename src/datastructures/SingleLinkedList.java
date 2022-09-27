package datastructures;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public static class Node<T> {
        T data;
        Node<T> next =  null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) { // 첫 노드 생성(첫 Node 를 생성할 때는 Head 가 없음)
            head = new Node<T>(data); // 첫 Node 생성 후, 이는 Head 가 됨
        } else { // 첫 Node 생성 이후(두 번째 노드부터)
            Node<T> node = this.head; // Head 를 가져옴
            while (node.next != null) { // Head 의 Next 가 있다면
                node = node.next; // Node 의 Next 값이 Node 가 됨
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<Integer>();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.printAll();
    }
}
