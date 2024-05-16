package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 18 - Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */
public class NumerosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criando uma verificação para saber se todos os números da lista são iguais
        boolean verificaSeTodosNumerosIguais = numeros.stream().allMatch(num -> num.equals(numeros.get(0)));

        // Verificando se todos os números da lista são iguais ou não, e imprimindo o resultado da verificação
        if (verificaSeTodosNumerosIguais) {
            System.out.println("Todos os números na lista são iguais.");
        } else {
            System.out.println("Os números na lista não são todos iguais.");
        }
    }
}
