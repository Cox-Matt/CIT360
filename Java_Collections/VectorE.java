/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Matthew
 */
public class VectorE {
    public static void main(String args[]) {
      /* Vector of initial capacity(size) of 2 */
      Vector<String> vec = new Vector<String>(10);

      /* Adding elements to a vector*/
      vec.addElement("Brad");
      vec.addElement("Kaleb");
      vec.addElement("Derek");
      vec.addElement("Tyrell");

      /* check size and capacityIncrement*/
      System.out.println("Amount of Children: "+vec.size());

      vec.addElement("Gabe");
      vec.addElement("Dani");
      vec.addElement("Taylor");

      /*size and capacityIncrement after two insertions*/
      System.out.println("New amount of children: "+vec.size());

      /*Display Vector elements*/
      Enumeration en = vec.elements();
      System.out.println("\nAll the Chidlren are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   }
}

