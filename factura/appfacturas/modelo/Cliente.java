package org.aguzman.appfacturas.modelo;

public class Cliente {
    private String nombre;
    private String nif;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }



    @Override
    public String toString() {
        return "Nombre del cliente: " + this.nombre + "\n"+
                "Numero de ID: " + this.nif;
    }
}
