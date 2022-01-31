public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void Extrato() {
        System.out.println("\n\t\tExtrato conta corrente\n");
        ImprimirInfos();
    }
}
