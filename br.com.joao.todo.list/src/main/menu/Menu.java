package menu;

import dominio.Tarefa;
import funcionalidades.CadastrarTarefa;
import funcionalidades.CompletarTarefa;
import funcionalidades.EditarDescricaoDeTarefaIncompleta;
import funcionalidades.ExibirTarefasIncompletas;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    List<Tarefa> listaDeTarefas;

    public Menu(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void printarMenuInicial() {
        System.out.println("Selecione a opcao desejada:");
        System.out.println("1- Cadastrar tarefa");
        System.out.println("2- Completar tarefa");
        System.out.println("3- Editar descricao de tarefa incompleta");
        System.out.println("4- Remover uma tarefa incompleta");
        System.out.println("5- Arquivar tarefa incompleta");
        System.out.println("6- Desarquivar tarefa");
        System.out.println("7- Exibir tarefas completadas");
        System.out.println("8- Exibir tarefas incompletas");
        System.out.println("9- Exibir tarefas incompletas");
        System.out.println("10- Sair");
        System.out.print("Opcao: ");
        int opcaoSelecionada = scanner.nextInt();

        switch (opcaoSelecionada) {
            case 1: {
                System.out.print("Digite a descricao da tarefa: ");
                scanner.nextLine();
                String descricaoDaTarefa = scanner.nextLine();
                Tarefa tarefa = new Tarefa(descricaoDaTarefa, false);
                CadastrarTarefa cadastrarTarefa = new CadastrarTarefa(listaDeTarefas);
                cadastrarTarefa.cadastrar(tarefa);
                printarMenuInicial();
                break;
            }
            case 2: {
                ExibirTarefasIncompletas exibirTarefasIncompletas = new ExibirTarefasIncompletas(listaDeTarefas);
                exibirTarefasIncompletas.exibirTarefas();
                System.out.print("Qual tarefa deseja marcar como completa: ");
                int tarefaIndice = scanner.nextInt();
                CompletarTarefa completarTarefa = new CompletarTarefa();
                completarTarefa.completarTarefa(listaDeTarefas.get(tarefaIndice));
                printarMenuInicial();
                break;
            }
            case 3: {
                ExibirTarefasIncompletas exibirTarefasIncompletas = new ExibirTarefasIncompletas(listaDeTarefas);
                exibirTarefasIncompletas.exibirTarefas();
                System.out.print("Qual tarefa deseja alterar a descricao: ");
                int tarefaIndice = scanner.nextInt();
                System.out.print("Digite a nova descricao da tarefa: ");
                String novaDescricao = scanner.nextLine();
                EditarDescricaoDeTarefaIncompleta editarDescricaoDeTarefaIncompleta = new EditarDescricaoDeTarefaIncompleta();
                editarDescricaoDeTarefaIncompleta.editarDescricao(listaDeTarefas.get(tarefaIndice), novaDescricao);
                printarMenuInicial();
                break;
            }
            case 10: {
                break;
            }
        }
    }
}
