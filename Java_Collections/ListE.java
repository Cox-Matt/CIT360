/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Matthew
 */
public class ListE { 
    
    public static void main(String args[]){  
        
        ArrayList<String> al=new ArrayList<>();  
        al.add("Top");  
        al.add("to");  
        al.add("Bottom.");  
        System.out.println("element at 2nd position: "+al.get(2));
        
        ListIterator<String> li=al.listIterator();  
        System.out.println("Top to Bottom.");  
        while(li.hasNext()){  
        System.out.println(li.next());  
        }  
        
        System.out.println("Bottom to Top.");  
        while(li.hasPrevious()){  
            System.out.println(li.previous());  
        }  
    }  
}  

