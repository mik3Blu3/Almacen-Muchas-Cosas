package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;
import java.util.Scanner;

/**
 *
 * @author angelrg
 */
public class ManejadorArticulos {

   int numA;

	Scanner entrada = new Scanner(System.in);
        Articulo[] articulos= new Articulo[5];

	public Articulo[] datosArticulo(){
		
		articulos[0]= new Articulo(1,321, "yogurthYes", 25, 25);
		articulos[1]= new Articulo(2,654, "aceiteIdeal", 30, 45);
		articulos[2]= new Articulo(3,987, "gelatinaFrutita", 20, 10);
		articulos[3]= new Articulo(4,791, "GalHelNapol", 13, 30);
		articulos[4]= new Articulo(5,901, "PanMolde", 12, 18);

		return articulos;
	}

	public Articulo buscadorArticulos(Articulo[] articulo, int codigo){
		for(Articulo articuloActual: articulo){	            
	            if(articuloActual.getCodigo()==codigo)    
                    return articuloActual;			    
                }   
                
                return null;
	}    
        
         public void printArticulos(Articulo[] articulos) {//esto se hizo porque manejador clientes NO HEREDA DE clientes, por lo tanto requiere usar una var si se quiere emplear el método de clientes, desde MC
        for (int x = 0; x < articulos.length; x++) {
            articulos[x].printMe();
        }
    }
	

	public int editarArtic(){
		

		System.out.println("Ingresa el número de articulo a editar: ");
		numA=entrada.nextInt();
		articulos[numA-1].printMe();
		articulos[numA-1].EditMe();
                
                return numA;
	}	

    
}
