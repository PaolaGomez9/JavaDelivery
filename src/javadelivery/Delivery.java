package javadelivery;

import java.util.List;
import java.util.ArrayList;

public class Delivery {
 public double costoEnvio = 70;
 public double Cantidad;

List<Comercio> carrito;
 
    public Delivery(double Cantidad, double costoEnvio) {
        this.Cantidad = Cantidad;
        
        this.carrito= new ArrayList<Comercio>();
    }
 
  public void Funcion_Costo(double cantidad){
   if(cantidad==1){
    costoEnvio =70;
       System.out.println(costoEnvio + ".LPS");
   } else{
   costoEnvio +=70;
   System.out.println(costoEnvio + ".LPS");
   }   
  }

  public void ComboPersonal(double precio , double costoEnvio){
  System.out.println(" El precio de su combo es :  " + precio +".LPS" + "  Mas el envio:  " + (precio+ costoEnvio) + ".LPS" );
  }
public void ComboDuo(double precio , double costoEnvio){
  System.out.println(" El precio de su combo es :  " + precio +".LPS" + "  Mas el envio:  " + (precio+ costoEnvio) + ".LPS" );
  }

 public void ComboFamiliar(double precio , double costoEnvio){
  System.out.println(" El precio de su combo es :  " + precio +".LPS" + "  Mas el envio:  " + (precio+ costoEnvio) + ".LPS" );
  }
 public void sumaCombos(double personal,double complemento, double costoEnvio){
     this.costoEnvio+=70;
     double total = personal + complemento + this.costoEnvio;
     
     System.out.println("Su total a pagar es: "+ total + ".LPS" );
 } 
 
 public void agregar_a_carrito(Comercio c){
        this.carrito.add(c);
    }
 
  public void vaciar_carrito(){
        this.carrito.removeAll(this.carrito);
    }

  public void imprimir_carrito(){
        for(Comercio c : this.carrito){
            c.impimir();
        }
        System.out.println("\n");
    }

 
}
    

