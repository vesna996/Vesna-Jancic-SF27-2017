package model;

import java.util.ArrayList;

/**
 * @author Vesna
 * @version 1.0
 * @created 12-May-2020 9:53:29 PM
 */
public class ServisnaKnjizica {

	private Automobil automobil;
	public ArrayList<Servis> m_Servis;
	public Automobil m_Automobil;

	public ServisnaKnjizica(){

	}

	public void finalize() throws Throwable {

	}

	public Automobil getAutomobil(){
		return automobil;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAutomobil(Automobil newVal){
		automobil = newVal;
	}

}