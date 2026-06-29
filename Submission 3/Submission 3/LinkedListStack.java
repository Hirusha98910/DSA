public class LinkedListStack {

    class StackNode {
        int element;
        StackNode next;

        StackNode(int element) {
            this.element = element;
        }
    }

    StackNode peakNode;

    public void push(int element) {
        StackNode incomingNode = new StackNode(element);

        incomingNode.next = peakNode;
        peakNode = incomingNode;
    }

    public int pop() {
        if (peakNode == null) {
            return -1;
        }

        int poppedElement = peakNode.element;
        peakNode = peakNode.next;

        return poppedElement;
    }

    public void display() {
        StackNode iteratorNode = peakNode;

        while (iteratorNode != null) {
            System.out.print(iteratorNode.element + " ");
            iteratorNode = iteratorNode.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack linkedStack = new LinkedListStack();

        linkedStack.push(10);
        linkedStack.push(20);
        linkedStack.push(30);

        linkedStack.display();

        System.out.println(linkedStack.pop());

        linkedStack.display();
    }
}
