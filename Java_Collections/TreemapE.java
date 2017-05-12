/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Matthew
 */
public class TreemapE {

    public static void main(String args[]) {

        TreeMap<String, String> tmap = new TreeMap<String, String>();
        
        tmap.put("PoopHead", "Pa$$word1"); 
        tmap.put("BuffaloEater", "Pa$$word2");
        tmap.put("AnimalRider", "Pa$$word3");
        tmap.put("SquirrelWarrior", "Pa$$word4");
        tmap.put("FurryChiken", "Pa$$word5");

        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Username: "+ me.getKey() + "   /    Password: ");
            System.out.println(me.getValue());
        }

   }
}
