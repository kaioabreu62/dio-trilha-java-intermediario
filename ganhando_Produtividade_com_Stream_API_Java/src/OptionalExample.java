import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        /*
        of(value): Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.
             Optional<String> optionalValue = Optional.of("Hello");
             System.out.println(optionalValue.get());
         */

        /*
        ofNullable(value): Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.
             String nullableValue = null;
             Optional<String> optionalValue = Optional.ofNullable(nullableValue);
             System.out.println(optionalValue.isPresent());
         */

        /*
        empty(): Retorna um Optional vazio (sem valor).
            Optional<String> optionalValue = Optional.empty();
            System.out.println(optionalValue.isPresent());
         */

        /*
        isPresent(): Verifica se o Optional contém um valor não nulo.
            Optional<String> optionalValue = Optional.of("Hello");
            System.out.println(optionalValue.isPresent());
         */

        /*
        isEmpty() (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).
            Optional<String> optionalValue = Optional.ofNullable(null);
            System.out.println(optionalValue.isEmpty());
         */

        /*
        get(): Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.
            Optional<String> optionalValue = Optional.of("Hello");
            System.out.println(optionalValue.get());
         */

        /*
        orElse(defaultValue): Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio
             Optional<String> optionalValue = Optional.ofNullable(null);
             String result = optionalValue.orElse("Default");
             System.out.println(result);
         */

        /*
        orElseGet(supplier): Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.
            Optional<String> optionalValue = Optional.ofNullable(null);
            String result = optionalValue.orElseGet(() -> "Value from Supplier");
            System.out.println(result);
         */

        /*
        orElseThrow(exceptionSupplier): Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.
            Optional<String> optionalValue = Optional.ofNullable(null);
            String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
         */

        /*
        ifPresent(consumer): Executa uma ação fornecida por um Consumer se o Optional contiver um valor.
            Optional<String> optionalValue = Optional.of("Hello");
            optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
         */
    }
}
