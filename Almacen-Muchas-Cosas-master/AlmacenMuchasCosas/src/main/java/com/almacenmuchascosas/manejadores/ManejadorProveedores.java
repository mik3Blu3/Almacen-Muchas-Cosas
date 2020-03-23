package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;


/**
 *
 * @author angelrg
 */
public class ManejadorProveedores {
    public Proveedor [] crearProveedores() 
    {
        Proveedor[] proveedores =new Proveedor[3];
        proveedores[0] = new Proveedor("1","Juan","ciudad","12345","Leonel");
        proveedores[1] = new Proveedor("2","Luis","ciudad","24","Edgar");
        proveedores[2] = new Proveedor("3","Ruben","ciudad","135","Mauricio");
        
        return proveedores;
    }
    public Proveedor buscarProveedor(Proveedor[] proveedores, String NIT){   
        for(Proveedor proveedor: proveedores){
            if(proveedor.getNIT().equalsIgnoreCase(NIT)){
                return proveedor;
            }  
        }
        return null;
    }
    public void printProveedor(Proveedor [] proveedores){
         System.out.println("Aqui comienzan proveedores");
        for (Proveedor proveedor : proveedores) {
            proveedor.printMe();
        }
                }
    
    /*public Proveedor buscarArticuloProveedor(){
        
    }*/
}
