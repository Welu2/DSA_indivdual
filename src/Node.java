public class Node {
    char data;
    Node next;
    Node(char data) {// Define a constructor for the Node class
        this.data = data;// Assign the given 'data' value to the 'data' field of the node
        this.next = null;// Set the 'next' pointer of the node to null, indicating it's not currently linked to another node
    }
}
