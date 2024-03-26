package org.aguzman.appfacturas;

import org.aguzman.appfacturas.bbdd.GestorClientes;
import org.aguzman.appfacturas.modelo.*;

import java.util.Scanner;

import static org.aguzman.appfacturas.modelo.Factura.MAX_ITEMS;


public class EjemploFactura {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        GestorClientes listadoClientes = new GestorClientes();

        System.out.print("Ingrese los datos del cliente" + "\n"  );
        Cliente cliente = new Cliente();
        System.out.print("Ingrese el nombre ");
        cliente.setNombre(s.nextLine());
        System.out.print("Ingrese el ID ");
        cliente.setNif(s.nextLine());

        //verificamos si el cliente existe en nuestro listado
        boolean clienteExistente =  listadoClientes.clienteExiste(cliente);

        if (!clienteExistente){
            listadoClientes.agregarCliente(cliente);
        }

        //test de cliente
       // System.out.println(cliente);

        System.out.print("Ingrese una descripción de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;

        System.out.println();

        /*NOTA: LA CANTIDAD DE ITEMS ESTA A 2 PARA HACER PRUEBAS
        * falta desarrollar
        * */
        for(int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura.generarDetalle());
    }
}
