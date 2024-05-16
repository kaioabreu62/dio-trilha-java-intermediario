package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
*/
public class CalcularMediaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criando uma lista para filtrar somente os números maiores que 5
        List<Integer> numerosMaioresQueCinco = numeros.stream().filter(n -> n > 5).toList();

        // Efetuando o cálculo da média dos números maiores que 5
        double media = numerosMaioresQueCinco.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        // Imprimindo o resultado da média dos números maiores que 5
        System.out.println("O resultado da média dos números maiores que 5 é: " + media);
    }
}
