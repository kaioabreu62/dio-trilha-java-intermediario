package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */
public class NumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando os números primos da lista
        List<Integer> primos = numeros.stream().filter(NumerosPrimos::isPrime).toList();

        // Imprimindo os números primos da lista
        System.out.println("Os números primos são: " + primos);

    }

    // Método private que verifica quais dos números da lista são números primos
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch(n -> num % n != 0);
    }
}
