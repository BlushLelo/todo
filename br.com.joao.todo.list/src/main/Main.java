public class Main {
    public static void main(String[] args) {

        toDoList list = new toDoList();

        list.insertTask("lavar louça","lavar a louça suja a 3 dias");
        list.insertTask("lavar dog","lavar o dogo");
        list.showIncomplete();


    }
}
