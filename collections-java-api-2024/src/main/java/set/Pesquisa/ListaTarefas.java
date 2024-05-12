package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        conjuntoTarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemovida = null;
        if (!conjuntoTarefas.isEmpty()) {
           for (Tarefa t : conjuntoTarefas) {
               if (t.getDescricao().equalsIgnoreCase(descricao)) {
                   tarefaRemovida = t;
                   break;
               }
           }
            if (tarefaRemovida != null) {
                conjuntoTarefas.remove(tarefaRemovida);
            }
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
    }

    public void exibirTarefas() {
        if (!conjuntoTarefas.isEmpty()) {
            System.out.println(conjuntoTarefas);
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
    }

    public int contarTarefas() {
        return conjuntoTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> conjuntoTarefasConcluidas = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.isVerificaTarefa()) {
                    conjuntoTarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
        return conjuntoTarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> conjuntoTarefasPendentes = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (!t.isVerificaTarefa()) {
                    conjuntoTarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
        return conjuntoTarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa marcarTarefaConcluida = null;
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    marcarTarefaConcluida = t;
                    break;
                }
            }
            if (marcarTarefaConcluida != null) {
                marcarTarefaConcluida.setVerificaTarefa(true);
            }
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa marcarTarefaPendente = null;
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    marcarTarefaPendente = t;
                    break;
                }
            }
            if (marcarTarefaPendente != null) {
                marcarTarefaPendente.setVerificaTarefa(false);
            }
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
    }

    public void limparListaTarefas() {
        Set<Tarefa> conjuntoLimparTarefas = new HashSet<>(conjuntoTarefas);
        if (!conjuntoTarefas.isEmpty()) {
            conjuntoTarefas.removeAll(conjuntoLimparTarefas);
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        //adicionando tarefas no conjunto ListaTarefas.
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        listaTarefas.adicionarTarefa("Tarefa 6");

        //exibindo todas as tarefas adicionadas e mostrando o tamanho do conjunto ListaTarefas.
        listaTarefas.exibirTarefas();
        System.out.println("Existem " + listaTarefas.contarTarefas() + " tarefa(s) para serem feitas!");

        //removendo tarefa do conjunto ListaTarefas.
        listaTarefas.removerTarefa("Tarefa 3");
        listaTarefas.exibirTarefas();
        System.out.println("Existem " + listaTarefas.contarTarefas() + " tarefa(s) para serem feitas!");

        //marcando tarefas como concluídas.
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 2");

        //marcando tarefas como pendentes.
        listaTarefas.marcarTarefaPendente("Tarefa 4");
        listaTarefas.marcarTarefaPendente("Tarefa 5");
        listaTarefas.marcarTarefaPendente("Tarefa 6");

        //obtendo tanto as tarefas concluídas e as tarefas pendentes.
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        //limpando totalmente as tarefas do conjunto ListaTarefa.
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
        System.out.println("Existem " + listaTarefas.contarTarefas() + " tarefa(s) para serem feitas!");

    }
}
