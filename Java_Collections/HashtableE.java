/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Matthew
 */
public class HashtableE {

    public static void main(String args[]) {
      
        Hashtable age = new Hashtable();
        Enumeration names;
        String str;
        int a;

        age.put("Matthew", new Float (28));
        age.put("Kyrsten", new Float (27));
        age.put("Gaberial", new Float (5));
        age.put("Dannielle", new Float (2));
        age.put("Bella", new Float (1));

        names = age.keys();
      
        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + age.get(str));
        }
    }
}
