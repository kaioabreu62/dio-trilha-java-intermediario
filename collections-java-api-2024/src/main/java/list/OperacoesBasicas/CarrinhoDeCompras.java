package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaRemoveItem = new ArrayList<>();
        for (Item it : itens) {
            if(it.getNome().equalsIgnoreCase(nome)) {
                listaRemoveItem.add(it);
            }
        }
        itens.removeAll(listaRemoveItem);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item it : itens) {
            total += it.getPreco() * it.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras itens = new CarrinhoDeCompras();

        //itens que adicionei para serem adicionados e calculados os valores.
        itens.adicionarItem("TV Samsung", 3000.00, 1);
        itens.adicionarItem("Iphone 15", 5000.00, 1);
        itens.adicionarItem("Capinha para Iphone", 100.00, 1);
        itens.adicionarItem("Película de Vidro para Iphone", 150.00, 1);
        itens.adicionarItem("Carregador de Iphone", 350.00, 1);

        //itens que adicionei para serem removidos
        itens.adicionarItem("Air Pods Apple", 650.00, 1);
        itens.adicionarItem("Air Pods Apple", 650.00, 1);
        itens.exibirItens();

        //itens que quis remover
        itens.removerItem("Air Pods Apple");
        itens.exibirItens();

        //calculando o valor total dos itens adicionados.
        System.out.println("O valor total a ser pago é: R$ " + String.format("%.2f", itens.calcularValorTotal()));


    }
}
