package com.almacenmuchascosas.manejadores;
import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author angelrg
 */
public class ManejadorArticulos {
    public Articulo [] crearArticulos(){
        Articulo [] articulos = new Articulo[5];
        articulos[0]= new Articulo("1", "Huevos", "12", "1");
        articulos[1]= new Articulo("2", "Insumos", "25", "20");
        articulos[2]= new Articulo("3", "Leche", "30", "10");
        articulos[3]= new Articulo("4", "Arroz", "15", "5");
        articulos[4]= new Articulo("5", "Maiz", "19", "8");
        
                return articulos;
    }
    public void printArticulos(Articulo [] articulos){
     System.out.println("Aqui comienzan los articulos que tenemos");
     for(Articulo articulos1:articulos){
         articulos1.printArticulos();
     }
    }
    public Articulo buscarArticulo(Articulo[] articulos, String codigo)
    {
        for(Articulo articulo1: articulos){
            if (articulo1.getCodigo().equalsIgnoreCase(codigo)){
                return articulo1;
            }
        }
        return null;
    }

    
}
