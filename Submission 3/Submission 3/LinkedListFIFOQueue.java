public class LinkedListFIFOQueue {

    class QueueNode {
        int item;
        QueueNode next;

        QueueNode(int item) {
            this.item = item;
        }
    }

    QueueNode head;
    QueueNode tail;

    public void enqueue(int item) {
        QueueNode addedNode = new QueueNode(item);

        if (tail == null) {
            head = tail = addedNode;
        } else {
            tail.next = addedNode;
            tail = addedNode;
        }
    }

    public int dequeue() {
        if (head == null) {
            return -1;
        }

        int removedItem = head.item;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return removedItem;
    }

    public void display() {
        QueueNode curr = head;

        while (curr != null) {
            System.out.print(curr.item + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListFIFOQueue fifoQueue = new LinkedListFIFOQueue();

        fifoQueue.enqueue(10);
        fifoQueue.enqueue(20);
        fifoQueue.enqueue(30);

        fifoQueue.display();

        System.out.println(fifoQueue.dequeue());

        fifoQueue.display();
    }
}
