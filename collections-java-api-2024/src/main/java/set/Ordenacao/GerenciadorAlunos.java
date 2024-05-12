package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public Set<Aluno> removerAluno(long matricula) {
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula().equals(matricula)) {
                    alunoSet.remove(a);
                    break;
                }
            }
        } else {
            System.out.println("Esse conjunto de Alunos é vazio!");
        }
        return alunoSet;
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        } else {
            System.out.println("Esse conjunto Alunos é vazio!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        //exibindo conjunto Alunos vazio.
        gerenciadorAlunos.exibirAlunos();

        //adicionando alunos no conjunto Alunos.
        gerenciadorAlunos.adicionarAluno("Kaio Abreu", 123456L, 10d);
        gerenciadorAlunos.adicionarAluno("Kaique Silva", 12345678L, 5d);
        gerenciadorAlunos.adicionarAluno("Luiza Abreu", 12345678910L, 10d);
        gerenciadorAlunos.adicionarAluno("Fulano", 1234567891011L, 6d);
        gerenciadorAlunos.adicionarAluno("Sicrano", 123456789101112L, 8d);
        gerenciadorAlunos.adicionarAluno("Beltrano", 12345678910111213L, 9d);
        gerenciadorAlunos.adicionarAluno("Margareth", 12345L, 0d);

        //não é possível adicionar um aluno quando ele possui a mesma matrícula de outro aluno.
        gerenciadorAlunos.adicionarAluno("Joaquim", 1234567891011L, 4d);

        //exibindo alunos adicionados ao conjunto Alunos.
        gerenciadorAlunos.exibirAlunos();

        //exibindo alunos por ordem alfabética de nomes do conjunto Alunos.
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        //exibindo alunos por ordem de notas do conjunto Alunos.
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        //removendo o aluno Margareth pela sua matrícula do conjunto Alunos.
        gerenciadorAlunos.removerAluno(12345L);
        gerenciadorAlunos.exibirAlunos();

    }
}
