
package javadelivery;

public class Comercio {
public String nombrePro;
//public int menu;
public double precio;
public double entrega;

Delivery d;

    public Comercio(String nombrePro, double precio,double entrega) {
        this.nombrePro = nombrePro;
        //this.menu = menu;
        this.precio= precio;
        this.entrega= entrega;
    }

 public void impimir(){
System.out.println("Nombre del producto :"+ this.nombrePro + "   Precio del producto: " + this.precio +  "   Costo de la entrega:  " + this.entrega );
   }
  public void productoExtra(String nombrePro,double precio, double entrega){
      
      System.out.println("Nombre del producto extra :"+ nombrePro + "   Precio del producto: " + precio +".LPS" +  "   Costo de la entrega:  " + entrega + ".LPS"); 
  }
       
}
 

