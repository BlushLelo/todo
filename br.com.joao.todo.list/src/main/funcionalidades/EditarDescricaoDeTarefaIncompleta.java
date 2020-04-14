package funcionalidades;

import dominio.Tarefa;

public class EditarDescricaoDeTarefaIncompleta {

    public void editarDescricao(Tarefa tarefa, String novaDescricao) {
        tarefa.setDescricao(novaDescricao);
    }
}
