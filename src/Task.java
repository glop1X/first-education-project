public class Task {
    private static int idCounter = 1;
    final int id;
    final String task;
    private boolean status;

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public Task(String taskText, boolean taskStatus){
        this.task = taskText;
        this.id = idCounter++;
        this.status = taskStatus;
    }
}
