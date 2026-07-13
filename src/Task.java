public class Task {
    private static int idCounter = 1;
    private int id;
    private String task;
    private boolean status = false;

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public boolean getStatus(){
        return status;
    }

    /*public void setId(int id){
        this.id = id;
    }*/

    public void setTask(String task){
        if(task.isBlank()){
            throw new IllegalArgumentException("Задача не может быть пустой!");
        } else this.task = task;
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
