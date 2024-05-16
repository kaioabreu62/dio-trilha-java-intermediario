package desafios_StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
*/
public class VerificaNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificando se existe um número maior do que dez na lista
        boolean verificaNumeroMaiorQueDez = numeros.stream().anyMatch(n -> n > 10);

        // Imprimindo o resultado
        System.out.println("Existe algum número maior que 10 nessa lista? " + verificaNumeroMaiorQueDez);
    }
}
