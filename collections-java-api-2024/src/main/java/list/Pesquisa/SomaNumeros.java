package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Integer> listaNumerosInteiros;

    public SomaNumeros() {
        this.listaNumerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer sm : listaNumerosInteiros) {
            soma += sm;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for (Integer n : listaNumerosInteiros) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        for (Integer n : listaNumerosInteiros) {
            if (n <= menorNumero) {
                menorNumero = n;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listaNumerosInteiros);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaNumerosInteiros=" + listaNumerosInteiros +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros sm = new SomaNumeros();

        //números inteiros adicionados.
        sm.adicionarNumero(3);
        sm.adicionarNumero(5);
        sm.adicionarNumero(8);
        sm.adicionarNumero(4);
        sm.adicionarNumero(2);

        //exibindo esses números inteiros adicionados.
        sm.exibirNumeros();

        //imprimindo na tela a soma dos números inteiros, o maior número inteiro entre eles e o menor número inteiro.
        System.out.println("A soma dos números é: " + sm.calcularSoma());
        System.out.println("O maior número é: " + sm.encontrarMaiorNumero());
        System.out.println("O menor número é: " + sm.encontrarMenorNumero());

    }
}
