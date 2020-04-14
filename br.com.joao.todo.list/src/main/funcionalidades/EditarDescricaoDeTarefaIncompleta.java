package funcionalidades;

import dominio.Tarefa;

public class EditarDescricaoDeTarefaIncompleta {

    public void executar(Tarefa tarefa, String novaDescricao) {
        tarefa.setDescricao(novaDescricao);
    }
}
