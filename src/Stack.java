public class Stack {
    Node head;

    public Stack() {
        head = null;
    }
    // Method to push a new element onto the stack
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Method to pop the top element from the stack
    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    // Method to peek at the top element without removing it
    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        Stack myAlphabet = new Stack();
        myAlphabet.push('A');
        myAlphabet.push('B');
        myAlphabet.push('C');
        myAlphabet.push('D');
        myAlphabet.push('1');
        System.out.println("pop element: " + myAlphabet.pop());
        System.out.println("peek element: " + myAlphabet.peek());
        System.out.println("Stack elements: ");
        while (!myAlphabet.isEmpty()) {  // Loop until stack is empty
            System.out.println(myAlphabet.pop()); // Pop and print remaining elements
        }

    }
}
// reference-linked list note ,bard ai and chatgpt