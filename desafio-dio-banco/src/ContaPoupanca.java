public class ContaPoupanca extends Conta {

    public ContaPoupanca(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "tipoConta = Conta Poupança" +
                ", cliente = " + cliente.getNome() +
                ", saldo = R$ " + String.format("%.2f", saldo) +
                '}';
    }
}
