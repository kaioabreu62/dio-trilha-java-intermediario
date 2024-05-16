package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
*/
public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrando o maior número primo da lista
        OptionalInt maiorNumeroPrimo = numeros.stream().filter(MaiorNumeroPrimo::isPrime).mapToInt(Integer::intValue).max();

        // Imprimindo o maior número primo da lista
        System.out.println("O maior número primo da lista é: " + maiorNumeroPrimo.getAsInt());

    }

    // Método private para verificar quais os números da lista são primos
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch(n -> num % n != 0);
    }
}
