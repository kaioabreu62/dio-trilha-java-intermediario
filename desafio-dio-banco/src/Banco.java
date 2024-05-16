import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static final String nome = "Banco Digital DIO";
    private final List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarContas(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Não há contas cadastradas");
        } else {
            for (Conta conta : contas) {
                System.out.println(conta);
            }
        }
    }
}
