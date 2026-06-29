public class CircularDoublyLinkedList {

    class Element {
        int value;
        Element next;
        Element prev;

        Element(int value) {
            this.value = value;
        }
    }

    Element startNode = null;

    public void insert(int value) {
        Element nodeToAdd = new Element(value);

        if (startNode == null) {
            startNode = nodeToAdd;
            startNode.next = startNode;
            startNode.prev = startNode;
        } else {
            Element tailNode = startNode.prev;

            tailNode.next = nodeToAdd;
            nodeToAdd.prev = tailNode;
            nodeToAdd.next = startNode;
            startNode.prev = nodeToAdd;
        }
    }

    public void display() {
        if (startNode == null) {
            return;
        }

        Element current = startNode;

        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != startNode);

        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        cdll.insert(10);
        cdll.insert(20);
        cdll.insert(30);

        cdll.display();
    }
}
