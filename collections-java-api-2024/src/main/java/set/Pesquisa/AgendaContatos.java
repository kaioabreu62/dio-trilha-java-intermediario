package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if(c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        } else {
            System.out.println("Esse conjunto é vazio!");
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Kaio", 123456);
        agendaContatos.adicionarContato("Kaio", 0);
        agendaContatos.adicionarContato("Kaio Abreu", 1111111);
        agendaContatos.adicionarContato("Kaio 010", 654987);
        agendaContatos.adicionarContato("Luiza Abreu", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Luiza"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Luiza Abreu", 5555555));

        System.out.println("Agenda de Contatos Atualizado: " );
        agendaContatos.exibirContatos();
    }

}
