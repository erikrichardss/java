package exercise.projetos.proj3.servico;

import exercise.projetos.proj3.dominio.Cliente;
import exercise.projetos.proj3.dominio.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private Conta[] contas;
    private Transacao transacao;
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void transferir(Conta origem, Conta destino, double valor) {

        if (origem.getSaldo() >= valor) {
            origem.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void listagemClientes() {
        if (this.clientes != null) {
            for (Cliente listaCliente : this.clientes) {
                System.out.println("Cliente: " + listaCliente.getNome() +
                        ", CPF: " + listaCliente.getCpf());
            }
        }
    }

    public void buscarCliente(String nome) {
        for (Cliente buscarClientes : this.clientes) {
            if (nome.equalsIgnoreCase(buscarClientes.getNome())) {
                System.out.println("Nome: " + buscarClientes.getNome() +
                        ", cpf: " + buscarClientes.getCpf());
            }
        }
    }

    public void listagemContas() {
        if (this.contas != null) {
            for (Conta listaContas : this.contas) {
                System.out.println("Conta: " + listaContas.getNumero());
            }
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Conta[] getContas() {
        return contas;
    }

    public Transacao getTransacao() {
        return transacao;
    }
}
