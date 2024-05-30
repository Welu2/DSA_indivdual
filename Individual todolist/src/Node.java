public class Node {
    public Task task;
    public Node next;
    public Node(Task task) {// Constructor that takes a `Task` object as input and initializes the node's fields.
        this.task = task;
        this.next = null;}// Set the `this.next` field to `null` initially
    // indicating that the node doesn't have a following node yet.
}
// reference-linked list note