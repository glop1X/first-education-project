public class Tasks {

    private int ID;
    private String Task;
    private boolean Status = false;

    public int getID() {
        return ID;
    }

    public String getTask() {
        return Task;
    }

    public boolean getStatus(){
        return Status;
    }

    public void setID(int id){
        ID = id;
    }

    public void setTask(String task){
        if(task.isBlank()){
            System.out.println("Задача не может быть пустой!");
        } else Task = task;
    }

    public void setStatus(boolean status){
        Status = status;
    }

}
