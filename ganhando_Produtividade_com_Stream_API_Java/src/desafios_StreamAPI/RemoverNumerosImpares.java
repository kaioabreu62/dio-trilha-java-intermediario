package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 4 - Remova todos os valores ímpares:
Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
*/
public class RemoverNumerosImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criando uma lista para armazenar somente os números pares, ou seja, eliminamos os números ímpares
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();

        // Imprimindo somente os números pares da lista
        System.out.println(numerosPares);
    }
}
