package com.almacenmuchascosas.entidades;

/**
 *
 * @author angelrg
 */
public class Proveedor extends Entidad {

    int telefono;
    String nombreContacto;

    public Proveedor(String NIT, String nombre, String direccion, String telefono, String nombreContacto) {
        super(NIT, nombre, direccion);
        this.telefono = Integer.parseInt(telefono);
        this.nombreContacto = nombreContacto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
    @Override
    public void printMe() {
        System.out.println("NIT: " + getNIT() + ", Nombre: " + getNombre() + ", Direccion: " + getDireccion() + ", telefono: " +getTelefono() +", Nombre de contacto: "+getNombreContacto());
    }

}
