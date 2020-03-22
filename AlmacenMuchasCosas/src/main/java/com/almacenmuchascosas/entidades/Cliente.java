package com.almacenmuchascosas.entidades;

/**
 *
 * @author angelrg
 */
public class Cliente extends Entidad {//en las clases ya sean hijas o padres, se coloca lo que harán y en los manjadores los métodos que manipulan sus datos, ya sean mostrándolos o creandolos

    private final double desc = 0.1;

    double descuento;

    public Cliente() {
    }

    public Cliente(int numero, String NIT, String nombre, String direccion, boolean descuento) {
        super(numero, NIT, nombre, direccion);
        if (descuento) {
            this.descuento = desc;
        } else {
            this.descuento = 0;
        }
    }

    public double getDescuento() {
        return descuento * 100;
    }

    public void setDescuento(boolean descuento) {//pudo haberlo utilizado en el constructor
        if (descuento) {
            this.descuento = desc;
        } else {
            this.descuento = 0;
        }
    }

    @Override
    public void printMe() {
        System.out.println("No. "+ getNumero()+", NIT: " + getNIT() + ", Nombre: " + getNombre() + ", Direccion: " + getDireccion() + ", Descuento: " + getDescuento());
    }

}

//entonces en colclusión, el funcionamiento general o específico de las clases debe ir en  padre e hijas, repectivamente
//los datos es recomendable guardarlos en el manejador, y todo lo que involucre su respectiva muestra general (por medio de un método hacia donde van los datos) o específica  en él tambien
