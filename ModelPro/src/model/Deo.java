package model;

/**
 * @author Vesna
 * @version 1.0
 * @created 12-May-2020 9:53:28 PM
 */
public class Deo {

	private double cena;
	private Marka markaAutomobila;
	private Model modelAutomobila;
	private String naziv;

	public Deo(){

	}

	public void finalize() throws Throwable {

	}

	public double getCena(){
		return cena;
	}

	public Marka getMarkaAutomobila(){
		return markaAutomobila;
	}

	public Model getModelAutomobila(){
		return modelAutomobila;
	}

	public String getNaziv(){
		return naziv;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCena(double newVal){
		cena = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setMarkaAutomobila(Marka newVal){
		markaAutomobila = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setModelAutomobila(Model newVal){
		modelAutomobila = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNaziv(String newVal){
		naziv = newVal;
	}

}