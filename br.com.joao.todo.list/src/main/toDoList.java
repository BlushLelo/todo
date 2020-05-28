import java.util.ArrayList;

public class toDoList {
    ArrayList<task> tasks = new ArrayList<task>();
    ArrayList<task> archivedTasks = new ArrayList<task>();


    public void insertTask(String title, String description) {
        task task = new task(title, description);
        tasks.add(task);
    }

    public void removeTask(String title) {
        int i;
        for(i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getTitle().equals(title) && !tasks.get(i).getIscomplete()){
                tasks.remove(i);
                return;
            }
        }
        System.out.println("Task nao esta na lista ou está completa");
    }

    public void showList(){
        for (task t : tasks){
            System.out.println(t.getTitle());
            System.out.println(t.getDescription());
            System.out.println();
        }
    }

    public void showIncomplete(){
        for (task t : tasks){

            if(!t.getIscomplete()) {
                System.out.println(t.getTitle());
                System.out.println(t.getDescription());
                System.out.println();
            }
        }
    }

    public void editTask(String title,String newDescription){
        for (task t : tasks){

            if(t.getTitle().equals(title) && !t.getIscomplete()) {
                t.setTitle(newDescription);
                return;
            }
        }
        System.out.println("Tarefa não está na lista, ou já está completa");
    }

    public void markTask(String title){
        for(task t : tasks){
            if(t.getTitle().equals(title) && !t.getIscomplete()){
                t.setIscomplete(true);
                return;
            }
        }

        System.out.println("Tarefa não está na lista, ou já está completa");
    }

    public void archiveTask(String title){

        int i;
        for(i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getTitle().equals(title) && !tasks.get(i).getIscomplete()){
                task t = new task(tasks.get(i).getTitle(),tasks.get(i).getDescription());
                tasks.remove(i);
                archivedTasks.add(t);
                return;
            }
        }
        System.out.println("Tarefa não está na lista, ou já está completa");
    }

    public void deArchiveTask(String title){
        int i;
        for(i = 0; i < archivedTasks.size(); i++){
            if(archivedTasks.get(i).getTitle().equals(title)){
                task t = new task(archivedTasks.get(i).getTitle(),archivedTasks.get(i).getDescription());
                archivedTasks.remove(i);
                tasks.add(t);
                return;
            }
        }
    }

}
