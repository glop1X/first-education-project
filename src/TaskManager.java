import java.util.List;

public class TaskManager {

    public void addTask(List<Task> tasks, String task){
        if(tasks != null){
                tasks.add(new Task(task, false));
        }
    }

    public void deleteTask(List<Task> tasks, int id){
        if(tasks != null){
            tasks.removeIf(task -> task.getId() == id);
        }
    }
}
