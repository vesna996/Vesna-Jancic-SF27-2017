package model;

import java.util.ArrayList;

/**
 * @author Vesna
 * @version 1.0
 * @created 12-May-2020 9:53:29 PM
 */
public class Musterija extends Korisnik {

	private int brojBodova;
	public ArrayList<Automobil> m_Automobil;
	

	public Musterija(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public int getBrojBodova(){
		return brojBodova;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBrojBodova(int newVal){
		brojBodova = newVal;
	}

}