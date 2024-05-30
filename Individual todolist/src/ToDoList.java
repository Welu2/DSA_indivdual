public class ToDoList {
    private Node head;
    public ToDoList () {
        head = null;
    }
    public void addToDo(Task task) {
        Node newNode = new Node(task);//create a new Node object that takes the provided task object as an argument

        if(head == null) {// if it is empty then newNode becomes first element
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null) {// iterate until current.next == null
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void markToDoAsCompleted(String title) {
        Node current = head;
        while(current != null) {
            if(current.task.getTitle().equals(title)) {// check if both have the same value
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("ToDoList "+title + "doesn't exist");
    }
    public void viewToDoList() {
        Node current = head;
        System.out.println("ToDoList: ");
        while(current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        ToDoList List = new ToDoList();
//adding TodoLists
        List.addToDo(new Task("Assignment 1", "DSA individual"));

        List.addToDo(new Task("Exam 1", "Applied mid "));

        List.addToDo(new Task("Exam 2", "Networking Lab"));
        List.addToDo(new Task("Assignment 2", "Networking Lab Report"));
        List.addToDo(new Task("Project", "Database group project"));
        List.addToDo(new Task("Duty", "Study for Final Exam :("));


        List.markToDoAsCompleted("Assignment 1");//marking a ToDoList as completed
        List.markToDoAsCompleted("Exam 1");
        List.viewToDoList();//viewing to do list
    }
}
// reference-linked list note