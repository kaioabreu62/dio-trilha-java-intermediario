package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
*/
public class OrdenarNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criando uma lista para ordenar os números em ordem crescente
        List<Integer> ordenarNumerosOrdemCrescente = numeros.stream().sorted().toList();

        // Imprimindo os números em ordem crescente
        System.out.println(ordenarNumerosOrdemCrescente);


    }
}
