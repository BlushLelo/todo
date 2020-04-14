import dominio.Tarefa;
import menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tarefa> listaDeTarefas = new ArrayList<>();
        Menu menu = new Menu(listaDeTarefas);
        menu.printarMenuInicial();
    }
}
