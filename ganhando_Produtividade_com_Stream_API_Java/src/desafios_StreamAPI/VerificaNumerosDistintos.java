package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
 */
public class VerificaNumerosDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se todos os números da lista são distintos, ou seja, não se repetem
        boolean verificaNumerosDistintos = numeros.stream().distinct().equals(numeros);

        // Exibindo o resultado da verificação
        System.out.println("Todos os números da lista são distintos (não se repetem)? " + verificaNumerosDistintos);
    }
}
