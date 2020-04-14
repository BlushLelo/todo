package funcionalidades;

import dominio.Tarefa;

import java.util.List;

public class ExibirTarefasIncompletas {

    private List<Tarefa> listaDeTarefas;

    public ExibirTarefasIncompletas(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : listaDeTarefas) {
            System.out.println("Lista de tarefas incompletas");
            //listaDeTarefa.indexOf retorna o indice da tarefa na lista, ela nao necessariamente esta ordenada.
            if (!tarefa.isCompleta()) {
                System.out.println(listaDeTarefas.indexOf(tarefa) + " - Descricao: " + tarefa.getDescricao());
            }
        }
    }
}
