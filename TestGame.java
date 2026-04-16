public class TestGame {
    public static void main(String[] args) {

        System.out.println("Game Start :))");

        // ToDoList:
        List<String> todoList = new ArrayList<>();
        todoList.add("Create 'Graphics Engine'");
        todoList.add("Define structure");

        System.out.println("");
        System.out.println("TODO: ");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + 1 + ". " + todoList.get(i));
        }

    }
}