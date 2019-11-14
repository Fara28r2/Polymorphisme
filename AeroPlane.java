/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author ASUS
 */
public class AeroPlane extends Venicle {
    public void walk(){
  System.out.println("Aeroplane is fliying");
}
public static void main (String[]args) {
  AeroPlane garuda = new AeroPlane();
  garuda.function();
  garuda.fuel();
  garuda.walk();
}
}

