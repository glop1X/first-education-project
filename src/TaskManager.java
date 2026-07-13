import java.util.ArrayList;

public class TaskManager {


    public void addTask(ArrayList<Task> tasks, String task, boolean status ){
        if(tasks != null){
                tasks.add(new Task(task, status));
        }
    }

    public void deleteTask(ArrayList<Task> tasks, int id){
        if(tasks != null){
            tasks.removeIf(task -> task.getId() == id);
        }
    }
}
