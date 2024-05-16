import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private final List<Cliente> clientes;

    public Cliente() {
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
