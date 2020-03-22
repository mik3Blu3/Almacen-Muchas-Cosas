package com.almacenmuchascosas;

import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.manejadores.ManejadorArticulos;
import com.almacenmuchascosas.manejadores.ManejadorClientes;
import com.almacenmuchascosas.manejadores.ManejadorProveedores;

/**
 *
 * @author angelrg
 */
public class Almacen {
    int numP;
    int numA;    
    
    ManejadorClientes clientesM = new ManejadorClientes();
    ManejadorProveedores MP = new ManejadorProveedores();
    ManejadorArticulos MA = new ManejadorArticulos();    		
	
    		
    //Esto está acá, por el hecho de que necesito el arr para los manejadores?
    Cliente[] clientes;//en estos no es necesario colocarle la parte del tamaño?,talvez no porque abajo rescibe un cantidad específica, lo cual vendría a simular int[] arr ={,,,};
    Proveedor[] proveedor;	
    Articulo[] articulo;	
    
    public void inicio() {
	System.out.printf("%10s", "ALMACEN MUCHAS COSAS\n\n");
	


        clientes = clientesM.crearDatos();//Agarra a todo lo que en el arreglo clientes se encuentre, por el return, ya que devulve el arr entero
        clientesM.printClientes(clientes);
	System.out.println("\n");

	proveedor = MP.datosProveedor();
	MP.printProveedores(proveedor);
	System.out.println("\n");
	numP=MP.editarProv();
        System.out.println("\n");
        System.out.println("PROVEEDOR EDITADO");
        proveedor[numP-1].printMe();
        
        
	articulo = MA.datosArticulo();
	MA.printArticulos(articulo);
	System.out.println("\n");
	numA=MA.editarArtic();
        System.out.println("\n");
        System.out.println("ARTICULO EDITADO");
        articulo[numA-1].printMe();
    }
}
        
