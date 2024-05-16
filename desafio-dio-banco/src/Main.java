public class Main {
    public static void main(String[] args) {

        // Instanciando um objeto Banco
        Banco banco = new Banco();

        // Criando o primeiro cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Kaio Abreu");
        cliente.adicionarCliente(cliente);

        // Criando o segundo cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Fulano");
        cliente.adicionarCliente(cliente1);

        // Criando o terceiro cliente
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Sicrano");
        cliente.adicionarCliente(cliente2);

        // Criando uma Conta Corrente para o primeiro cliente
        Conta cc = new ContaCorrente(banco, cliente);
        banco.adicionarContas(cc);
        cc.depositar(100);

        // Criando uma Conta Poupança para o primeiro cliente
        Conta poupanca = new ContaPoupanca(banco, cliente);
        banco.adicionarContas(poupanca);
        cc.transferir(100, poupanca);

        // Criando uma Conta Corrente para o segundo cliente
        Conta cc1 = new ContaCorrente(banco, cliente1);
        banco.adicionarContas(cc1);
        cc1.depositar(250);

        // Criando uma Conta Poupança para o segundo cliente
        Conta poupanca1 = new ContaPoupanca(banco, cliente1);
        banco.adicionarContas(poupanca1);
        cc1.transferir(150, poupanca1);

        // Criando uma Conta Corrente para o terceiro cliente
        Conta cc2 = new ContaCorrente(banco, cliente2);
        banco.adicionarContas(cc2);
        cc2.depositar(1000);
        cc2.sacar(500);

        // Criando uma Conta Poupança para o terceiro cliente
        Conta poupanca2 = new ContaPoupanca(banco, cliente2);
        banco.adicionarContas(poupanca2);
        cc2.transferir(500, poupanca2);

        // Imprimindo o extrato tanto da Conta Corrente como da Conta Poupança do primeiro cliente
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Imprimindo o extrato tanto da Conta Corrente como da Conta Poupança do segundo cliente
        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        // Imprimindo o extrato tanto da Conta Corrente como da Conta Poupança do terceiro cliente
        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        System.out.println("\n" + "=== Listando as contas existentes ===");
        banco.listarContas();
    }
}
