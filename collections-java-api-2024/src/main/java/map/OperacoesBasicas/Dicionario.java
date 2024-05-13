package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Esse map está vazio!");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Esse map está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String pesquisarPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            pesquisarPorPalavra = dicionarioMap.get(palavra);
        } else {
            System.out.println("Esse map está vazio!");
        }
        return pesquisarPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionarioMap = new Dicionario();

        //adicionando palavras e suas respectivas definições no dicionarioMap.
        dicionarioMap.exibirPalavras();
        dicionarioMap.adicionarPalavra("Variável", "Um símbolo que representa um valor mutável.");
        dicionarioMap.adicionarPalavra("Algoritmo", "Conjunto de passo para resolver um problema.");
        dicionarioMap.adicionarPalavra("Booleano", "Tipo de dado que pode ser verdadeiro ou falso.");
        dicionarioMap.adicionarPalavra("Iteração", "Repetição de um conjunto de instruções.");
        dicionarioMap.adicionarPalavra("Concatenação", "União de duas ou mais strings.");
        dicionarioMap.adicionarPalavra("Parâmetro", "Valor passado para uma função ou método.");
        dicionarioMap.adicionarPalavra("Recursão", "Uma função que chama a si mesma.");
        dicionarioMap.adicionarPalavra("Interface", "Ponto de interação entre sistemas ou usuários.");

        //exibindo as palavras e suas definições do dicionárioMap.
        dicionarioMap.exibirPalavras();

        //removendo palavras e suas definições do dicionárioMap.
        dicionarioMap.removerPalavra("Algoritmo");
        dicionarioMap.exibirPalavras();

        //Pesquisando uma definição por meio de sua respectiva palavra.
        System.out.println("A definição é: " + dicionarioMap.pesquisarPorPalavra("Booleano"));
    }

}
