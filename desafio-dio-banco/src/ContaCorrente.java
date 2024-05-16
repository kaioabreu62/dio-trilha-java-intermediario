public class ContaCorrente extends Conta {

    public ContaCorrente(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "tipoConta = Conta Corrente" +
                ", cliente = " + cliente.getNome() +
                ", saldo = R$ " + String.format("%.2f", saldo) +
                '}';
    }
}
