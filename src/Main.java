import java.util.Scanner;

void main() {
    TaskManager taskManager = new TaskManager();
    List<Task> tasks = new ArrayList<>();
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
            while(true) {
                String task = sc.nextLine();
                if(!task.equals("0")){
                    try{
                        taskManager.addTask(tasks, task);
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }else break;
            }
        }

        if(n == 2){
            if (tasks.isEmpty()) {
                System.out.println("Нет задач!");
            } else{
                for (Task currentTask : tasks) {
                    if (currentTask != null && currentTask.getTask() != null) {
                        System.out.println(currentTask.getId() + "." + currentTask.getTask());
                    }
                }
            }

        }

        if(n == 3) {
            if (tasks.isEmpty()) {
                System.out.println("Список пуст, нет задач для выполнения.");
            } else {
                System.out.println("Выберите задачу, которую хотите отметить выполненной:");
                int id = sc.nextInt();

                boolean found = false;
                for (Task currentTask : tasks) {
                    if(currentTask.getId() == id){
                            currentTask.setStatus(true);
                            found = true;
                            System.out.println("Задача успешно выполнена!");
                            break;
                    }
                }
                if (!found) {
                    System.out.println("Задача с таким ID не найдена.");
                }
            }
        }

        if(n == 4){
            if (tasks.isEmpty()) {
                System.out.println("Список пуст, нет задач для выполнения.");
            } else {
                System.out.println("Выберите задачу, которую хотите удалить:");
                int id = sc.nextInt();
                taskManager.deleteTask(tasks, id);
            }
        }

        if(n == 5){
            if (tasks.isEmpty()) {
                System.out.println("Список пуст, нет задач для выполнения.");
            } else {
                boolean hasUnfinished = false;
                for(Task currentTask : tasks){
                    if(!currentTask.getStatus()){
                        System.out.println(currentTask.getId() + "." + currentTask.getTask());
                        hasUnfinished = true;
                    }
                }
                if (!hasUnfinished) {
                    System.out.println("Нет невыполненных задач!");
                }
            }
        }
        System.out.println("Выберите следующую функцию:");
    }
}