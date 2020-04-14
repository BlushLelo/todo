package funcionalidades;

import dominio.Tarefa;

import java.util.List;

public class CadastrarTarefa {

    private List<Tarefa> listaDeTarefas;

    public CadastrarTarefa(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void cadastrar(Tarefa tarefa) {
        listaDeTarefas.add(tarefa);
    }
}
