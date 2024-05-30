public class Task {
    private String title, description;
    private boolean completed;
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }
    public String getTitle() {
        return title;
    }// This method returns the title of the Task object.
    public String getDescription() {
        return description;
    }// This method returns the description of the Task object.
    public boolean isCompleted() {
        return completed;
    } // This method returns true if the Task is completed, false otherwise.
    public void markCompleted() {
        completed = true;
    }// This method marks the Task as completed by setting the completed flag to true.
    public String toString() {
        return  "* "+ title + " : " +

                description + ", Completed: " + completed;
    }
}
// reference-linked list note