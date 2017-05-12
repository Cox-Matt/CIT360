/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Matthew
 */
class CollectionE{
    
 public static void main(String args[]){
 
  ArrayList<String> al=new ArrayList<String>();
  al.add("Matthew");
  al.add("Kyrsten");
  
  ArrayList<String> al2=new ArrayList<String>();
  al2.add("Gabriel");
  al2.add("Danille");
  
  ArrayList<String> al3=new ArrayList<String>();
  al3.add("Bell");
  
  al.addAll(al2);  
  al.addAll(al3);
  
  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
