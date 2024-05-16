package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
*/
public class SomaNumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criando uma lista de números pares
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();

        // Somando os números pares da lista
        int resultado = pares.stream().reduce(0, Integer::sum);

        //Imprimindo o resultado da soma dos números pares da lista
        System.out.println("O resultado da soma dos números pares é: " + resultado);
    }
}
