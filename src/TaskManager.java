import java.util.Scanner;

public class TaskManager {
    public void addTask(Tasks[] myTask, String task, boolean status ){
           for(int i = 0; i < myTask.length; i++){
               if(myTask[i] == null){
                   myTask[i] = new Tasks();
                   myTask[i].setTask(task);
                   myTask[i].setID(i);
                   myTask[i].setStatus(status);
                   break;
               }
        }
    }
    public void deleteTask(Tasks[] myTask, int id){
        for(int i = 0; i < myTask.length; i++){
            if(myTask[i].getID() == id){
                myTask[i] = null;
                break;
            }
        }
    }

}
