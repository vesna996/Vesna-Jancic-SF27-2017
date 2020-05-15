

/**
 * @author Vesna
 * @version 1.0
 * @created 12-May-2020 9:53:29 PM
 */
public class Servis {

	private Automobil automobil;
	private LocalDate datumTermina;
	private String opis;
	private Serviser serviser;
	private LocalTime vremeTermina;
	public List<Deo> m_Deo;
	public Serviser m_Serviser;

	public Servis(){

	}

	public void finalize() throws Throwable {

	}

	public Automobil getAutomobil(){
		return automobil;
	}

	public LocalDate getDatumTermina(){
		return datumTermina;
	}

	public String getOpis(){
		return opis;
	}

	public Serviser getServiser(){
		return serviser;
	}

	public LocalTime getVremeTermina(){
		return vremeTermina;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAutomobil(Automobil newVal){
		automobil = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDatumTermina(LocalDate newVal){
		datumTermina = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOpis(String newVal){
		opis = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setServiser(Serviser newVal){
		serviser = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setVremeTermina(LocalTime newVal){
		vremeTermina = newVal;
	}

}