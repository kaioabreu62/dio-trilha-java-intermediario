package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 13 - Filtrar os números que estão dentro de um intervalo:
Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
*/
public class IntervaloNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando os números que estão dentro de um intervalo entre 5 e 10
        List<Integer> numerosPorUmIntervalo = numeros.stream().filter(n -> n >= 5 && n <= 10).toList();

        // Imprimindo os números que estão dentro de um intervalo entre 5 e 10
        System.out.println("Números que estão em um intervalo específico (entre 5 e 10): " + numerosPorUmIntervalo);
    }
}
