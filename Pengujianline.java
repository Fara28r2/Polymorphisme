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
public class Pengujianline {
    public boolean isGreater(Object a, Object b) {
       double aLen=((Line)a).getLength();
       double bLen=((Line)b).getLength();
      return(aLen>bLen);
    }

    
    public boolean isLess(Object a, Object b) {
       double aLen=((Line)a).getLength();
       double bLen=((Line)b).getLength();
      return(aLen<bLen);
    }

   
    public boolean isEqual(Object a, Object b) {
       double aLen=((Line)a).getLength();
       double bLen=((Line)b).getLength();
      return(aLen==bLen);
    }
    public static void main(String[] args) {
        
    }
}
