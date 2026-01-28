public class CircularLinkedList {
    NodeCLL head = null;

    public void append(int data) {
        NodeCLL newNodeCLL = new NodeCLL(data);
        if (head == null) {
            head = newNodeCLL;
        } else {
            NodeCLL current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNodeCLL;
        }
        newNodeCLL.next = head;
    }

    public void printList() {
        NodeCLL current = head;
        if (head != null) {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.append(1);
        cll.append(2);
        cll.append(3);
        cll.printList();  // Output: 1 2 3
    }
}
