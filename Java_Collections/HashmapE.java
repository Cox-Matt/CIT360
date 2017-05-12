/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Matthew
 */
public class HashmapE {
    
    public static void main(String args[]) {

        HashMap hm = new HashMap();

        hm.put("Matthew", 28);
        hm.put("Kyrsten", 27);
        hm.put("Gaberial", 5);
        hm.put("Dannielle", 3);
        hm.put("Bella", 1);

        Set set = hm.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + "'s age: ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }
}
