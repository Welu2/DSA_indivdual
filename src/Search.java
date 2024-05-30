public class Search {
    Node head;

    public Search() {
        head = null;
    }

    public boolean searchNode (char value) {
        Node current = head;
        if (head == null) {
            System.out.println("empty list");
            return false;
        }
        while (current != null) {
            if (current.data == value) {  // Compare with the specific value
                return true; // Found the node with the value
            }
            current = current.next;
        }

        return false;  // Not found
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
    Search element = new Search();
    element.append('A');element.append('B');
    element.append('D');element.append('E');
    System.out.println("Item : "+ element.searchNode('E'));
    element.display();
}
}
// reference-linked list note ,bard ai and chatgpt