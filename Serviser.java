

/**
 * @author Vesna
 * @version 1.0
 * @created 12-May-2020 9:53:29 PM
 */
public class Serviser extends Korisnik {

	private double plata;
	private Specijalizacija specijalizacija;
	public List<Servis> m_Servis;

	public Serviser(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void changingCosts(){

	}

	/**
	 * 
	 * @param car
	 * @param date
	 * @param time
	 * @param repairer
	 * @param description
	 */
	public Servis createServis(Automobil car, LocalDate date, LocalTime time, Serviser repairer, String description){
		return null;
	}

	/**
	 * 
	 * @param servisi
	 */
	public void editServis(List<Servis> servisi){

	}

	public double getPlata(){
		return plata;
	}

	public Specijalizacija getSpecijalizacija(){
		return specijalizacija;
	}

	public List<Servis> previewServisi(){
		return null;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPlata(double newVal){
		plata = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSpecijalizacija(Specijalizacija newVal){
		specijalizacija = newVal;
	}

}