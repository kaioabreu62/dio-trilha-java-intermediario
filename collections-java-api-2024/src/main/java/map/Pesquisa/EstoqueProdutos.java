package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        if (!estoqueProdutosMap.isEmpty()) {
            System.out.println(estoqueProdutosMap);
        } else {
            System.out.println("Esse map de estoque de produtos está vazio!");
        }
    }

    public double calculaValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("Esse map de estoque de produtos está vazio!");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        if (!estoqueProdutosMap.isEmpty()) {
            double maiorPreco = Double.MIN_VALUE;
            for (Produto p : estoqueProdutosMap.values()) {
               if (p.getPreco() > maiorPreco) {
                   //adiciona o produto 'p' na variável produtoMaisCaro
                   produtoMaisCaro = p;
                   //atualiza a variável maiorPreco para sempre guardar o maior valor
                   maiorPreco = p.getPreco();
               }
            }
        } else {
            System.out.println("Esse map de estoque de produtos está vazio!");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        if (!estoqueProdutosMap.isEmpty()) {
            double menorPreco = Double.MAX_VALUE;
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() <= menorPreco) {
                    //adiciona o produto 'p' na variável produtoMaisBarato
                    produtoMaisBarato = p;
                    //atualiza a variável menorPreco para sempre guardar o menor valor
                    menorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("Esse map de estoque de produtos está vazio!");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorValorTotalProdutoNoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoNoEstoque) {
                    maiorValorTotalProdutoNoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorTotalNoEstoque = entry.getValue();
                }
            }
        } else {
            System.out.println("Esse map de estoque de produtos está vazio!");
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 5.0, 10);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 10.0, 5);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 15.0, 2);
        estoqueProdutos.adicionarProduto(4L, "Produto D", 20.0, 2);

        estoqueProdutos.exibirProduto();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto com a maior quantidade de valor Total no Estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }


}
