package funcionalidades;

import dominio.Tarefa;

import java.util.List;

public class CompletarTarefa {

    public void executar(Tarefa tarefa) {
        tarefa.setCompleta(true);
    }
}
