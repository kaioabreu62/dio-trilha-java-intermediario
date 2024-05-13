package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("Esse map está vazio!");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("Esse map está vazio!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Kaio", 123456);
        agendaContatos.adicionarContato("Kaio", 5665);
        agendaContatos.adicionarContato("Kaio Abreu", 1111111);
        agendaContatos.adicionarContato("Kaio 010", 654987);
        agendaContatos.adicionarContato("Luiza Abreu", 1111111);
        agendaContatos.adicionarContato("Kaio", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Kaio 010");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Luiza Abreu"));
    }
}
