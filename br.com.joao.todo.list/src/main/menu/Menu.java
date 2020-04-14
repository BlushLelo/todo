package menu;

import dominio.Tarefa;
import funcionalidades.*;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    List<Tarefa> listaDeTarefas;
    ExibirTarefasIncompletas exibirTarefasIncompletas;
    ExibirTarefasCompletas exibirTarefasCompletas;
    EditarDescricaoDeTarefaIncompleta editarDescricaoDeTarefaIncompleta;
    CadastrarTarefa cadastrarTarefa;
    CompletarTarefa completarTarefa;
    RemoverTarefaIncompleta removerTarefaIncompleta;


    public Menu(List<Tarefa> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
        exibirTarefasIncompletas = new ExibirTarefasIncompletas(this.listaDeTarefas);
        editarDescricaoDeTarefaIncompleta = new EditarDescricaoDeTarefaIncompleta();
        cadastrarTarefa = new CadastrarTarefa(listaDeTarefas);
        completarTarefa = new CompletarTarefa();
        removerTarefaIncompleta = new RemoverTarefaIncompleta(this.listaDeTarefas);
        exibirTarefasCompletas = new ExibirTarefasCompletas(this.listaDeTarefas);
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
        System.out.println("10- Sair");
        System.out.print("Opcao: ");
        int opcaoSelecionada = scanner.nextInt();

        switch (opcaoSelecionada) {
            case 1: {
                System.out.print("Digite a descricao da tarefa: ");
                scanner.nextLine();
                String descricaoDaTarefa = scanner.nextLine();
                Tarefa tarefa = new Tarefa(descricaoDaTarefa, false);
                cadastrarTarefa.executar(tarefa);
                printarMenuInicial();
                break;
            }
            case 2: {
                exibirTarefasIncompletas.executar();
                System.out.print("Qual tarefa deseja marcar como completa: ");
                int tarefaIndice = scanner.nextInt();
                completarTarefa.executar(listaDeTarefas.get(tarefaIndice));
                printarMenuInicial();
                break;
            }
            case 3: {
                exibirTarefasIncompletas.executar();
                System.out.print("Qual tarefa deseja alterar a descricao: ");
                int tarefaIndice = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Digite a nova descricao da tarefa: ");
                String novaDescricao = scanner.nextLine();
                editarDescricaoDeTarefaIncompleta.executar(listaDeTarefas.get(tarefaIndice), novaDescricao);
                printarMenuInicial();
                break;
            }
            case 4: {
                exibirTarefasIncompletas.executar();
                System.out.print("Qual tarefa deseja remover: ");
                int tarefaIndice = scanner.nextInt();
                scanner.nextLine();
                removerTarefaIncompleta.executar(tarefaIndice);
                printarMenuInicial();
                break;
            }
            case 7: {
                exibirTarefasCompletas.executar();
                printarMenuInicial();
                break;
            }
            case 8: {
                exibirTarefasIncompletas.executar();
                printarMenuInicial();
                break;
            }
            case 10: {
                break;
            }
        }
    }
}
