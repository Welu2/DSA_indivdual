public class insertAtPosition {
    Node head;
    public insertAtPosition() {
        head = null;
    }
    // Method to insert a new node at the beginning
    public void insertAtBeginning(char value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    // Method to insert a new node at the specified position
    void insertAtPos(char value,int position) {
        Node current = head;
        int count = 1;
        // Check for invalid positions
        if (position < 1) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }
        if (position == 1){
            insertAtBeginning(value);
            return;
        }
        else {
            // Traverse to the node before the desired position
            while (current.next != null && count < position - 1) {
                count++;
                current = current.next;
            }
            // Check if position is beyond the end of the list
            if (current.next == null  && count < position - 1) {
                throw new IllegalArgumentException("The " + position + " position is beyond the end of the list");
            }

            Node newNode = new Node(value);// Create a new node and assign the value to its data field
            Node next = current.next;// Store a reference to the node that currently follows the current node
            current.next = newNode;
// Update the current node's next pointer to point to the new node
            newNode.next = next;
        }
    }
    // Method to add value into list
    void append(char value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
// otherwise traverse to the end
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    // method to print the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        insertAtPosition element = new insertAtPosition();
        element.append('A');element.append('B');
        element.append('D');element.append('E');
        element.insertAtPos('C',6);
        element.display();
    }
}
// reference-linked list note ,bard ai and chatgpt