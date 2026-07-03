import java.util.Scanner;
void main() {
    TaskManager TM = new TaskManager();
    Tasks[] myTask = new Tasks[100];
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("""
            Выберите функцию из списка:
            1. Добавить задачу
            2. Показать все задачи
            3. Отметить задачу выполненной
            4. Удалить задачу
            5. Показать невыполненные задачи
            0. Завершить программу
            """);
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
                if (!task.equals("0")) {
                    TM.addTask(myTask, task, false);
                }else break;
            }
        }
        if(n == 2){
            for(int i = 0;i < myTask.length; i++) {
                if(myTask[i] != null && myTask[i].getTask() != null){
                    System.out.println(myTask[i].getID()+1 + "." + myTask[i].getTask());
                } else {
                    System.out.println("Нет задач!");
                    break;
                }
            }
        }
        if(n == 3){
            System.out.println("Выберите задачу, которую хотите отметить выполненной:");
            int id = sc.nextInt() - 1;
            for(int i = 0; i < myTask.length; i++) {
                if(myTask[i] != null && myTask[i].getTask() != null){
                    if(myTask[i].getID() == id){
                    myTask[i].setStatus(true);
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
            TM.deleteTask(myTask, id - 1 );
        }if(n == 5){
            for(int i = 0; i < myTask.length; i++){
                if(myTask[i] != null && myTask[i].getStatus() == false){
                    System.out.println(myTask[i].getID()+1 + "." + myTask[i].getTask());
                } else {
                    System.out.println("Нет невыполненных задач!");
                    break;
                }
            }
        }
        System.out.println("Выберите следующую функцию:");
    }
}