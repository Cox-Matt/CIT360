/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.PriorityQueue;

/**
 *
 * @author Matthew
 */
public class PriorityqueueE {

    public static void main(String args[]) {
  
   PriorityQueue < Integer >  pq = new PriorityQueue < Integer > (); 
       
   for ( int i = 70; i  <  100; i++ ){  
   pq.add (new Integer (i)) ; 
   }
      
   System.out.println ( "Initial priority queue values are: "+ pq);

   Integer head = pq.poll();
      
   System.out.println ( "Head of the queue is: "+ head);
      
   System.out.println ( "Priority queue values after poll: "+ pq);
   }
}