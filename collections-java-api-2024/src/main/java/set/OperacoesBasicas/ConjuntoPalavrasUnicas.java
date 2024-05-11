package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavrasUnicas=" + conjuntoPalavrasUnicas +
                '}';
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!conjuntoPalavrasUnicas.isEmpty()) {
            if (conjuntoPalavrasUnicas.contains(palavra)) {
                conjuntoPalavrasUnicas.remove(palavra);
            } else {
                System.out.println("A palavra não pode ser removida, pois não existe!");
            }
        } else {
            System.out.println("Não há palavras no conjunto!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!conjuntoPalavrasUnicas.isEmpty()) {
            System.out.println(conjuntoPalavrasUnicas);
        } else {
            System.out.println("Não há palavras no conjunto!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        //adicionando palavras de frutas no Conjunto.
        palavras.adicionarPalavra("Banana");
        palavras.adicionarPalavra("Maçã");
        palavras.adicionarPalavra("Goiaba");
        palavras.adicionarPalavra("Manga");
        palavras.adicionarPalavra("Melão");
        palavras.adicionarPalavra("Melancia");

        //exibindo as palavras de frutas.
        palavras.exibirPalavrasUnicas();

        //verificando se as palavras de frutas especificadas existem.
        System.out.println("Existe no conjunto de palavras, o nome da fruta Mamão ?: " + palavras.verificarPalavra("Mamão"));
        System.out.println("Existe no conjunto de palavras, o nome da fruta Manga ?: " + palavras.verificarPalavra("Manga"));

        //removendo uma palavra de fruta especificada no Conjunto.
        palavras.removerPalavra("Maçã");
        palavras.exibirPalavrasUnicas();

    }

}
