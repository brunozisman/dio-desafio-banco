public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void Extrato() {
        System.out.println("\n\t\tExtrato conta poupança\n");
        ImprimirInfos();
    }
}
