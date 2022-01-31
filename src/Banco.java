import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void AddCliente(Cliente cliente)
    {
        this.clientes.add(cliente);
    }

    public String GetClientes()
    {
        String names = "\n";
        for(int i = 0; i < clientes.size(); i++)
        {
            names += clientes.get(i).getNome() + "\n";
        }

        return names;
    }
}
