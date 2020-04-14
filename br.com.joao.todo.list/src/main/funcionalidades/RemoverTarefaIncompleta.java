package funcionalidades;

import dominio.Tarefa;

import java.util.List;

public class RemoverTarefaIncompleta {
    List<Tarefa> listaDeTarefas;

    public RemoverTarefaIncompleta(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void executar(int indice) {
        listaDeTarefas.remove(indice);
    }
}
