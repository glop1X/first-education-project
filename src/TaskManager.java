public class TaskManager {
    public void addTask(Task[] tasks, String task, boolean status ){
           for(int i = 0; i < tasks.length; i++){
               if(tasks[i] == null){
                   tasks[i] = new Task();
                   tasks[i].setTask(task);
                   tasks[i].setId(i);
                   tasks[i].setStatus(status);
                   break;
               }
        }
    }
    public void deleteTask(Task[] myTask, int id){
        for(int i = 0; i < myTask.length; i++){
            if(myTask[i] != null && myTask[i].getTask() != null){
                if(myTask[i].getId() == id){
                    myTask[i] = null;
                    break;
            }   }else{
                System.out.println("Нет задач!");
                break;
            }
        }
    }

}
