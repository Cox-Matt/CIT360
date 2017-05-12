/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Matthew
 */
public class HashsetE {
    public static void main(String args[]){  
   
  HashSet<String> set=new HashSet<String>();  
  set.add("Bob");  
  set.add("Karen");
  set.add("Kyrsten");  
  set.add("Alisha");  
  set.add("Kyrsten");
  set.add("Alisha"); 
  
  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }
}
