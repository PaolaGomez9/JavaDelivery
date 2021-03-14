
package javadelivery;


public class Menu {
public int categoria;
public double cantidad;
Comercio c;
Delivery d;

    public Menu(int categoria) {
        this.categoria = categoria;
    }

    public void menu (int seleccion){
        System.out.println("Menu");
        System.out.println("1.Comidas Rapidas");
        System.out.println("2.Farmacias");
        System.out.println("3.Licores");
        System.out.println("4.Snacks");
        switch(seleccion){
            case 1:
                System.out.println("Comida Rapidas");
                   switch(categoria){
                       case 1: 
                           System.out.println("Pollo campero :");
                           Comercio comercio = new Comercio("Pechuga de pollo + papas ",100,70);
                           comercio.impimir();
                           Delivery compra1 = new Delivery(1,70);
                          // compra1.Funcion_Costo(1);
                           compra1.ComboPersonal(100, 70);
                           compra1.agregar_a_carrito(comercio);
                          // compra1.imprimir_carrito();
                           break;
                           
                           case 2: 
                           System.out.println("BIGOS");
                           Comercio comercio2 = new Comercio("Big Bigos ",199,70);
                           comercio2.impimir();
                           Delivery compra2 = new Delivery(1,70);
                           compra2.ComboPersonal(199, 70);
                           compra2.agregar_a_carrito(comercio2);
                           break;
                          
                           case 3: 
                           System.out.println("Buger king:");
                           Comercio comercio3 = new Comercio("Whopper + Nuggets + Sundae",120,70);
                           comercio3.impimir();
                           Delivery compra3 = new Delivery(1,70);
                           compra3.ComboPersonal(120, 70);
                           compra3.agregar_a_carrito(comercio3);
                           break;
                           
                           case 4: 
                           System.out.println("DD:");
                           Comercio comercio4 = new Comercio("Cafe Dunkin Donuts",25,70);
                           comercio4.impimir();
                           Delivery compra4 = new Delivery(1,70);
                           compra4.ComboPersonal(25, 70);
                           compra4.agregar_a_carrito(comercio4);
                           break;
                          
                           case 5 :
                           System.out.println("Dennys :");
                           Comercio comercio5 = new Comercio("Desayuno",200,70);
                           comercio5.impimir();
                           comercio5.productoExtra("Cafe Dunkin Donuts", 25,70);
                           Delivery compra5 = new Delivery(2,70);
                           compra5.sumaCombos(200, 25, 70);
                           compra5.agregar_a_carrito(comercio5);
                           
                           break;
                           
                           case 6: 
                           System.out.println("Super Baleadas");
                           Comercio comercio6 = new Comercio("Baleada Extrema", 90,70);
                           comercio6.impimir();
                           Delivery compra6 = new Delivery(1,70);
                           compra6.agregar_a_carrito(comercio6);
                           break;
                           
                           case 7: 
                           System.out.println("Mc Donalds");
                           Comercio comercio7 = new Comercio("Mc ForeverAlone",150,70);
                           comercio7.impimir();
                           Delivery compra7 = new Delivery(1,70);
                           compra7.agregar_a_carrito(comercio7);
                           break;
                           
                           case 8: 
                           System.out.println("Nichas burger");
                            Comercio comercio8 = new Comercio("HamburguesaNicha",130,70);
                            comercio8.impimir();
                            Delivery compra8 = new Delivery(1,70);
                           compra8.agregar_a_carrito(comercio8);
                           break;
                           
                           case 9: 
                           System.out.println("Furiwa");
                            Comercio comercio9 = new Comercio("Arroz Familiar",270,70);
                            comercio9.impimir();
                           Delivery compra9 = new Delivery(1,70);
                           compra9.agregar_a_carrito(comercio9);
                           break;
                           
                           case 10: 
                           System.out.println("Pizza planeta ");
                            Comercio comercio10 = new Comercio("Pizaa woody", 100,70);
                            comercio10.impimir();
                            Delivery compra10 = new Delivery(1,70);
                           compra10.agregar_a_carrito(comercio10);
                           break;
                      
                   } 
               
                break;
            case 2 :
                System.out.println("Farmacias:");
                System.out.println("No se encontro su busqueda");
                break;
            case 3 :
                System.out.println("Licores:");
                System.out.println("No se encontro su busqueda");
                break;
            case 4 : 
                System.out.println("Snacks:");
                System.out.println("No se encontro su busqueda");
                break;
        
        }
    
    
    }
  
    
}
