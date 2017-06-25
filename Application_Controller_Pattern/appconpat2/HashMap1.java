/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconpat2;

import java.util.HashMap;
/*
 * 
 */

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<String, Show> map = new HashMap<>();
		map = init();
		// iterate to all the keys stored on our hashmap
		for (String s : map.keySet()) {
			// print the student id and age
			System.out.println("TV Show and its Synopisis:" + s + map.get(s).getSynopsis());
		}
	}

	private static HashMap<String, Show> init() {
		// initialize our student objects
		Show s1 = new Show(
				"The Big Bang Theory - A woman who moves into an apartment next "
                + "door to two brilliant but socially awkward "
                + "physicists shows them how little they know about "
                + "life outside of the laboratory.");
		Show s2 = new Show(
				"Brooklyn 99 - Jake Peralta, an immature but talented "
                + "NYPD detective in Brooklyn's 99th Precinct, "
                + "comes into immediate conflict with his new "
                + "commanding officer, the serious and stern "
                + "Captain Ray Holt.");
		Show s3 = new Show(
				"Modern Family - A satirical look at three different "
                + "families and the trials they face in each of "
                + "their own uniquely comedic ways.");

		// initialize of hashmap
		HashMap<String, Show> map = new HashMap<String, Show>();

		// assign each student id as key and the student objects as values on
		// our hashmap
		map.put(s1.getShowid(), s1);
		map.put(s2.getShowid(), s2);
		map.put(s3.getShowid(), s3);

		return map;
	}

}