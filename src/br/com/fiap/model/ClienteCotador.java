package br.com.fiap.model;

public class ClienteCotador {
    private Cliente cliente;
    private Cotador cotador;

    public ClienteCotador(Cliente cliente, Cotador cotador) {
        this.cliente = cliente;
        this.cotador = cotador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cotador getCotador() {
        return cotador;
    }
}

