public class delete {
    Node head;
    public delete() {
        head = null;
    }
    void deleteAtStart() {
        if (head != null) { //if it is not empty list
            Node current = head;
            head = head.next;
            current.next = null;
        }
    }
   void deleteAtPosition(int position) {
       Node current = head;
       int count = 1;
       if(head == null) {
           System.out.println("empty list");
           return;
       }
       if (position < 1) {
           throw new IllegalArgumentException("Invalid position: " + position);
       }
       if (position == 1){
           deleteAtStart();
           return;
       }
       while (current.next != null && count < position - 1) {
           count++;
           current = current.next;
       }

// Check if position is beyond the end of the list
       if (current.next == null) {
           throw new IllegalArgumentException("Position " + position
           + " doesn't exist");
       }

       // Delete the last element (special case: position equals list length)
       if (current.next.next == null) {
           current.next = null;
           return;
       }
       // Delete the element in the middle
       Node del = current.next;// Store a reference to the node to be deleted
       Node next = current.next.next;// Store a reference to the node that will follow the current node after deletion
       current.next = next;//skip the node to be deleted and point directly to the next node
       del.next = null;// Isolate the deleted node by setting its next pointer to null

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
        delete element = new delete();
        element.append('A');element.append('B');
        element.append('D');element.append('E');
        element.deleteAtPosition(4);
        element.display();
    }


}
// reference-linked list note ,bard ai and chatgpt