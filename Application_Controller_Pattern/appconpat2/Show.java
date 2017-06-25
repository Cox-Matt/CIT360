/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconpat2;

/**
 *
 * @author Matthew
 */
import java.util.StringTokenizer;

public class Show {

	public Show(String s) {
		/*
		 * Pattern is id|name|bday|age|course
		 */

		// initializer our tokenizer
		StringTokenizer st = new StringTokenizer(s, "|");
		// set the values
		this.setShowid(st.nextToken());

	}

	public Show() {
		super();
	}


	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getShowid() {
		return showid;
	}

	public void setShowid(String showid) {
		this.showid = showid;
	}
        String synopsis;
	String showid;
    }
