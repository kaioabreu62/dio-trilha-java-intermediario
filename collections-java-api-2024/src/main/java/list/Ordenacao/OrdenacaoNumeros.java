package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listNumerosInteiros;

    public OrdenacaoNumeros() {
        this.listNumerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumerosInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listOrdenacaoAscendente = new ArrayList<>(listNumerosInteiros);
        Collections.sort(listOrdenacaoAscendente);
        return listOrdenacaoAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listOrdenacaoDescendente = new ArrayList<>(listNumerosInteiros);
        listOrdenacaoDescendente.sort(Collections.reverseOrder());
        return listOrdenacaoDescendente;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listNumerosInteiros=" + listNumerosInteiros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        //adicionando números inteiros na lista.
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(10);

        //ordenando de forma ascendente os números inteiros da lista.
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        //ordenando de forma descendente os números inteiros da lista.
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

}
