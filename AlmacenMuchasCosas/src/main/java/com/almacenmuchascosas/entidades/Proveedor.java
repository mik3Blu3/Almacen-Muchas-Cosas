package com.almacenmuchascosas.entidades;
	import java.util.Scanner;
/**
 *
 * @author angelrg
 */
public class Proveedor extends Entidad {

    int numero;
    int telefono;
    String nit;
    String dir;
    		
    String nombreContacto;

    public Proveedor() {
    }

    public Proveedor(int numero, String NIT, String nombre, String direccion, int telefono, String nombreContacto) {
        super(numero,NIT, nombre, direccion);
        this.numero= numero;
        this.telefono = telefono;
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
    public void printMe(){
	super.printMe();
	System.out.printf("Número de teléfono: %d \nNombre de Contacto: %s\n", getTelefono(), getNombreContacto());	
    }
	
    public void EditMe(){//si funciona, lo integraré a ENTIDAD, para que posea hasta lo de la direccion
	Scanner entrada = new Scanner(System.in);
	System.out.printf("\n\nIngrese nuevo NIT: ");
	nit = entrada.nextLine();
	setNIT(nit);
	System.out.printf("Ingrese nueva dirección: ");
	dir = entrada.nextLine();
	setDireccion(dir);
	System.out.printf("Ingrese nuevo numero telefónico: ");
	telefono = entrada.nextInt();
	setTelefono(telefono);
	System.out.printf("Ingrese nuevo nombre de contacto: ");
	nombreContacto = entrada.nextLine();
	setNombreContacto(nombreContacto);	
    }


}
