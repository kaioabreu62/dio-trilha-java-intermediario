package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
           contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("Esse map ContagemPalavras está vazio!");
        }
    }

    public void exibirContagemPalavras() {
        if (!contagemPalavrasMap.isEmpty()) {
            System.out.println(contagemPalavrasMap);
        } else {
            System.out.println("Esse map ContagemPalavras está vazio!");
        }
    }

    public String encontraPalavraMaisFrequente() {
        String palavraMaisFrequente  = null;
        int contagemMaior = 0;
        if (!contagemPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
               if (entry.getValue() > contagemMaior) {
                   contagemMaior = entry.getValue();
                   palavraMaisFrequente = entry.getKey();
               }
            }
        } else {
            System.out.println("Esse map ContagemPalavras está vazio!");
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        //exibindo o map ContagemPalavras vazio.
        contagemPalavras.exibirContagemPalavras();

        //adicionando palavras e suas contagens no map ContagemPalavras.
        contagemPalavras.adicionarPalavra("Java", 8);
        contagemPalavras.adicionarPalavra("Python", 6);
        contagemPalavras.adicionarPalavra("JavaScript", 4);
        contagemPalavras.adicionarPalavra("C#", 5);
        contagemPalavras.adicionarPalavra("Cobol", 2);

        //exibindo todas as palavras e suas respectivas contagens.
        contagemPalavras.exibirContagemPalavras();

        //removendo a palavra e sua contagem do map ContagemPalavras.
        contagemPalavras.removerPalavra("Cobol");
        contagemPalavras.exibirContagemPalavras();

        //encontrando a palavra que possui a contagem mais frequente.
        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontraPalavraMaisFrequente());

    }
}
