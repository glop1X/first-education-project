import java.util.List;

public class TaskManager {

    public void addTask(List<Task> tasks, String task){
        if(task == null || task.trim().isEmpty()){
            throw new IllegalArgumentException("Задача не может быть пустой");
        }
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
