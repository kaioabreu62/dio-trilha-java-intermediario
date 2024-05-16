package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 16 - Agrupe os números em pares e ímpares:
Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
*/
public class AgruparPares_E_Impares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupando em uma lista todos os números que são pares
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();

        // Agrupando em uma lista todos os números que são ímpares
        List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).toList();

        // Imprimindo todos os números pares da lista
        System.out.println("Os números pares são: " + pares);

        // Imprimindo todos os números ímpares da lista
        System.out.println("Os números ímpares são: " + impares);
    }
}
