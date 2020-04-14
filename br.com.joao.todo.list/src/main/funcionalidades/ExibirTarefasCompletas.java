package funcionalidades;

import dominio.Tarefa;

import java.util.List;

public class ExibirTarefasCompletas {

    private List<Tarefa> listaDeTarefas;

    public ExibirTarefasCompletas(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void executar() {

        System.out.println("Lista de tarefas completas");
        for (Tarefa tarefa : listaDeTarefas) {
            //listaDeTarefa.indexOf retorna o indice da tarefa na lista, ela nao necessariamente esta ordenada.
            if (tarefa.isCompleta()) {
                System.out.println(listaDeTarefas.indexOf(tarefa) + " - Descricao: " + tarefa.getDescricao());
            }
        }
    }
}
