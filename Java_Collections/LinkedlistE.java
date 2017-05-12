/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

/**
 *
 * @author Matthew
 */
import java.util.*;
public class LinkedlistE{

   public static void main(String args[]) {
      // create a linked list
      LinkedList ll = new LinkedList();
      
      // add elements to the linked list
      ll.add("Johnathan");
      ll.add("Sam");
      ll.add("Steven");
      ll.add("Benjamin");
      ll.add("Jeremy");
      ll.addLast("Matthew");
      ll.addFirst("Auree");
      ll.add(1, "Rachel");
      System.out.println("Original contents of Linked List: " + ll);

      // remove elements from the linked list
      ll.remove("Steven");
      ll.remove(2);
      System.out.println("Contents of Linked List after deletion: " + ll);
      
      // remove first and last elements
      ll.removeFirst();
      ll.removeLast();
      System.out.println("Linked List after deleting first and last: " + ll);

      // get and set a value
      Object val = ll.get(2);
      ll.set(2, (String) val + " Changed");
      System.out.println("Final Linked List after change: " + ll);
   }
}