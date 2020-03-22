package com.almacenmuchascosas.manejadores;
import com.almacenmuchascosas.entidades.Cliente;
	import java.util.Scanner;
        import com.almacenmuchascosas.entidades.Proveedor;

/**
 *
 * @author angelrg
 */

public class ManejadorProveedores {
	int numP;
        Proveedor proveedores[]= new Proveedor[5];	

	Scanner entrada = new Scanner(System.in);

	public Proveedor[] datosProveedor(){
		
		proveedores[0]= new Proveedor(1,"123", "Productos Lacteos YES", "11", 9987, "Fernando");
		proveedores[1]= new Proveedor(2,"456", "Ideal", "15", 9912, "Juan");
		proveedores[2]= new Proveedor(3,"789", "Productos de Maravilla", "14", 9923, "Estuardo");
		proveedores[3]= new Proveedor(4,"910", "Sarita", "13", 9934, "Junior");
		proveedores[4]= new Proveedor(5,"109", "Don Rodrigo", "12", 9945, "Alberto");

		return proveedores;
	}
        
       public void printProveedores(Proveedor[] proveedor) {//esto se hizo porque manejador clientes NO HEREDA DE clientes, por lo tanto requiere usar una var si se quiere emplear el método de clientes, desde MC
            for (int x = 0; x < proveedor.length; x++) {
                proveedor[x].printMe();
            }
        }

	public Proveedor buscadorProveedores(Proveedor[] proveedor, String Nit){
		for(Proveedor proveedorActual: proveedor){
	            if(proveedorActual.getNIT().equals(Nit)){  		
	                return proveedorActual;			
		    }               
                    
		}    
                return null;
	}//final del buscador

	public int editarProv(){
		

		System.out.println("Ingresa el número de proveedor a editar: ");
		numP=entrada.nextInt();
		proveedores[numP-1].printMe();
		proveedores[numP-1].EditMe();
                
                return numP;
	}
}//fin de la clase de manejado...



	//si se llegaran a modificar datos, esto debería hacerse en la clase de proveedores o aquí en el manejador,
	// si es en proveedores, entonces para guardar los cambios en el manejador, debo usar su respectiva variable
	//de refrencia, para luego indicarle el ńdice en el cual deseo guardar el dato y luego llamar al método..

	//                      -> proveedor[indice].cambiarnombreProveedor[indice]	
