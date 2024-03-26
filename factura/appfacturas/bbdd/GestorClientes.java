package org.aguzman.appfacturas.bbdd;

import org.aguzman.appfacturas.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class GestorClientes {

    private List<Cliente> clientes;

    public GestorClientes() {
        this.clientes = new ArrayList<>();
    }

    // Método para agregar un cliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para verificar si un cliente existe
    public  boolean clienteExiste(Cliente cliente) {
        return clientes.contains(cliente);
    }

    // Método para obtener todos los clientes
    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    // Método para eliminar un cliente
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    // Método para obtener la cantidad de clientes
    public int cantidadClientes() {
        return clientes.size();
    }




}
