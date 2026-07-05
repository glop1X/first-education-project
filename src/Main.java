import java.util.Scanner;
void main() {
    TaskManager taskManager = new TaskManager();
    Task[] tasks = new Task[100];
    Scanner sc = new Scanner(System.in);
    int n;
    final String menu = """
            Выберите функцию из списка:
            1. Добавить задачу
            2. Показать все задачи
            3. Отметить задачу выполненной
            4. Удалить задачу
            5. Показать невыполненные задачи
            0. Завершить программу
            """;
    System.out.println(menu);
    while(true){
        n = sc.nextInt();
        sc.nextLine();
        if(n == 0){
            break;
        }
        if(n == 1){
            System.out.println("Добавьте задачу:\n" +
                    "Для выхода напишите 0");
            for(int i = 0;; i++) {
                String task = sc.nextLine();
                if(!task.equals("0")){
                    try{
                        taskManager.addTask(tasks, task, false);
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }else break;
            }
        }
        if(n == 2){
            for(int i = 0;i < tasks.length; i++) {
                if(tasks[i] != null && tasks[i].getTask() != null){
                    System.out.println(tasks[i].getId()+1 + "." + tasks[i].getTask());
                } else {
                    System.out.println("Нет задач!");
                    break;
                }
            }
        }
        if(n == 3){
            System.out.println("Выберите задачу, которую хотите отметить выполненной:");
            int id = sc.nextInt() - 1;
            for(int i = 0; i < tasks.length; i++) {
                if(tasks[i] != null && tasks[i].getTask() != null){
                    if(tasks[i].getId() == id){
                    tasks[i].setStatus(true);
                    break;
                }
                } else{
                    System.out.println("Нет задач!");
                    break;
                }
            }
        }
        if(n == 4){
            System.out.println("Выберите задачу, которую хотите удалить:");
            int id = sc.nextInt();
            taskManager.deleteTask(tasks, id - 1 );
        }if(n == 5){
            for(int i = 0; i < tasks.length; i++){
                if(tasks[i] != null && tasks[i].getStatus() == false){
                    System.out.println(tasks[i].getId()+1 + "." + tasks[i].getTask());
                } else {
                    System.out.println("Нет невыполненных задач!");
                    break;
                }
            }
        }
        System.out.println("Выберите следующую функцию:");
    }
}