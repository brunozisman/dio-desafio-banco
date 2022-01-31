public class Main {
    public static void main(String[] args)
    {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Wilson");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        banco.AddCliente(cliente);

        cliente = new Cliente("Ruth");

        Conta cc_2 = new ContaCorrente(cliente);

        banco.AddCliente(cliente);

        cc_2.Depositar(1200);

        cc.Depositar(100);
        cc.Transferir(100, poupanca);

        cc.Extrato();
        poupanca.Extrato();

        cc_2.Extrato();

        System.out.println(banco.GetClientes());
    }
}
