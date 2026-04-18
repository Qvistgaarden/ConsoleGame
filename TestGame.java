import java.util.List;
import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {

        System.out.println("Game Start :))");

        // TodoList:
        List<String> todoList = new ArrayList<>();
        todoList.add("Create 'Graphics Engine'");
        todoList.add("Define structure");
        todoList.add("Implement Combat");

        System.out.println("");
        System.out.println("TODO: ");
        for (int i = 0; i < todoList.size(); i++){
            System.out.println(i + 1 + ". " + todoList.get(i));
        }

        // Entity tests
        Tools.ln();
        Entity player = new Entity("Dave",100);
        System.out.println(player.getDescription());

        Tools.ln();
        player.takeDamage(20,"fire");
        System.out.println("Applying 20 fire damage");
        System.out.println(player.getDescription());

        Tools.ln();
        System.out.println("Applying 20 fire damage with 20% resistance to fire");
        player.resistances.put("fire",0.2);
        player.takeDamage(20,"fire");
        System.out.println(player.getDescription());

    }
}