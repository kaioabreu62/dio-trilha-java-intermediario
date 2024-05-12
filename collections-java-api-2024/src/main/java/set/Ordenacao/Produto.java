package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    //atributos
    private long codProduto;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codProduto, String nome, double preco, int quantidade) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodProduto() {
        return codProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCodProduto() == produto.getCodProduto();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodProduto());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorCodProduto implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Long.compare(p1.getCodProduto(), p2.getCodProduto());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        //primeiro comparamos o preço
        int comparaPreco = Double.compare(p1.getPreco(), p2.getPreco());
        if (comparaPreco != 0) {
            return comparaPreco;
        }
        //se dois ou mais produtos possuem o mesmo preço, então será comparado pela quantidade
        return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
    }
}

class ComparatorPorQuantidade implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        //primeiro comparamos a quantidade
        int comparaQuantidade = Integer.compare(p1.getQuantidade(), p2.getQuantidade());
        if (comparaQuantidade != 0) {
            return comparaQuantidade;
        }
        //se dois ou mais produtos possuem a mesma quantidade, então será comparado pelo preço
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
