package com.almacenmuchascosas.articulo;

/**
 *
 * @author angelrg
 */
public class Articulo {

     String codigo;
    String nombre;
    String existencia;
    String precio;
   /**
     *
     * @param codigo
     * @param nombre
     * @param existencia
     * @param precio
     */
    public Articulo (String codigo, String nombre, String existencia, String precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public void printArticulos(){
        System.out.println("codigo: "+getCodigo() + " , Nombre de Artículo: "+getNombre()+" , Existencia: "+getExistencia()+ " , Precio: "+getPrecio());
    }
}
