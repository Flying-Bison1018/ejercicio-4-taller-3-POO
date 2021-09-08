
package coche;


public class PruebaCoche {

   
    public static void main(String[] args) {
        Coche c = new Coche();
        c.setColor("negro");
        System.out.println("Color: " + c.getColor());
        c.setColor("azul");
        System.out.println("Color: " + c.getColor());
        c.setColor("rojo");
        System.out.println("Color: " + c.getColor());
    }
    
}
