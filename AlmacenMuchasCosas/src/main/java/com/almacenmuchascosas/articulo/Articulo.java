package com.almacenmuchascosas.articulo;

import java.util.Scanner;

/**
 *
 * @author angelrg
 */
public class Articulo {

    private int numero;
    private int codigo;
    private String nombre;
    private int existencia;
    private double precio;

    public Articulo() {
    }

    public Articulo(int numero,int codigo, String nombre, int existencia, double precio) {
        this.numero=numero;
        this.codigo = codigo;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }

     public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void printMe() {
	System.out.printf("\nNumero: %d Código: %d \nNombre de artículo: %s\nExistencia: %d\nPrecio: %.2f", getNumero(), getCodigo(), getNombre(), getExistencia(), getPrecio());	
    }    

    public void EditMe(){
	Scanner entrada = new Scanner(System.in);
	System.out.printf("Ingrese cantidad existente: ");
	existencia = entrada.nextInt();
	setExistencia(existencia);
	System.out.printf("Ingrese nuevo precio: ");
	precio = entrada.nextDouble();
	setPrecio(precio);       
        
    }

}
