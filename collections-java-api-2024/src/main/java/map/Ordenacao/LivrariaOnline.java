package main.java.map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        livroMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        if (!livroMap.isEmpty()) {
            List<String> chavesRemover = new ArrayList<>();
            for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    chavesRemover.add(entry.getKey());
                }
            }
            for (String chave : chavesRemover) {
               livroMap.remove(chave);
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        if (!livroMap.isEmpty()) {
            List<Map.Entry<String , Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livroMap.entrySet());
            Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

            Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
            for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
                livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
            }
            return livrosOrdenadosPorPreco;
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        if (!livroMap.isEmpty()) {
            List<Map.Entry<String , Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livroMap.entrySet());
            Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

            Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
            for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
                livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
            }
            return livrosOrdenadosPorAutor;
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        if (!livroMap.isEmpty()) {
            Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
            for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
                Livro livro = entry.getValue();
                if (livro.getAutor().equals(autor)) {
                    livrosPorAutor.put(entry.getKey(), livro);
                }
            }
            return livrosPorAutor;
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;
        if (!livroMap.isEmpty()) {
            for (Livro livro : livroMap.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livroMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;
        if (!livroMap.isEmpty()) {
            for (Livro livro : livroMap.values()) {
                if (livro.getPreco() <= precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livroMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }



    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://bit.ly/3yu2uQY", "Cem anos de solidão", "Gabriel García Márquez", 29.90d);
        livrariaOnline.adicionarLivro("https://bit.ly/3QGy2ti", "O alquimista", "Paulo Coelho", 35.52d);
        livrariaOnline.adicionarLivro("https://bit.ly/3QMbTtD", "A cabana", "William P. Young", 38.64d);
        livrariaOnline.adicionarLivro("https://bit.ly/3UNSOsq", "O Poder do Agora: Um guia para a iluminação espiritual", "Eckhart Tolle", 37.42d);
        livrariaOnline.adicionarLivro("https://bit.ly/4bmaz95", "O sol é para todos", "Harper Lee", 48.36d);
        livrariaOnline.adicionarLivro("https://bit.ly/3UHd9PT", "A coragem de ser imperfeito: Como aceitar a própria vulnerabilidade, vencer a vergonha e ousar ser quem você é", "Brené Brown", 37.42d);
        livrariaOnline.adicionarLivro("https://bit.ly/3WFMXaZ", "1984", "George Orwell", 17.44d);
        livrariaOnline.adicionarLivro("https://bit.ly/4beAAad", "A culpa é das estrelas", "John Green", 44.92d);

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "John Green";
        System.out.println("Livro pesquisado pelo Autor: " + livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: \n" + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: \n" + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livroMap);
    }
}
