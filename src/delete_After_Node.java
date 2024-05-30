public class delete_After_Node {
    Node head;
    public delete_After_Node() {
        head = null;
    }

    // Method to delete a node after a given node
    public void deleteAfterNode(Node prevNode) {
        Node current = head;
        if(head == null) {
            System.out.println("empty list");
            return;
        }
        while (current != null && current != prevNode) {
            current = current.next;
        }

        // Handle cases: prevNode not found or at the end
        if (current == null) {
            System.out.println("Given node doesn't exist");
            return;
        } else if (current.next == null) {
            System.out.println("Cannot delete after the last node");
            return;
        }
            // Delete the element in the middle
            Node del = current.next;// Store a reference to the node to be deleted
            current.next = del.next;//skip the node to be deleted and point directly to the next node
            del.next = null;// Isolate the deleted node by setting its next pointer to null

        }
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
    void display() {
    Node current = head;
    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}
    public static void main(String[] args) {
    delete_After_Node element = new delete_After_Node();
    element.append('A') ;element.append('B');
    element.append('D');element.append('E');
    element.deleteAfterNode(element.head);
    element.display();
}

}
// reference-linked list note ,bard ai and chatgpt