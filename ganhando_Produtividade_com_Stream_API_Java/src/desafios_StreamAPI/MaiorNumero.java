package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
*/
public class MaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Obtendo o maior número da lista
        Optional<Integer> maiorNumero = numeros.stream().max(Integer::compareTo);

        // Utilizando o maior número da lista para verificar o segundo maior
        int maxNumero = maiorNumero.get();
        Optional<Integer> segundoMaiorNumero = numeros.stream().filter(n -> n != maxNumero).max(Integer::compareTo);

        // Imprimindo o segundo maior número da lista
        System.out.println("O segundo maior número da lista é: " + segundoMaiorNumero.get());
    }
}
