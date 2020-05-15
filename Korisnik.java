

/**
 * @author Vesna
 * @version 1.0
 * @created 12-May-2020 9:53:28 PM
 */
public class Korisnik {

	private String adresa;
	private String brojTelefona;
	private String ime;
	private int jmbg;
	private String korisnickoIme;
	private String lozinka;
	private Pol pol;
	private String prezime;

	public Korisnik(){

	}

	public void finalize() throws Throwable {

	}

	public String getAdresa(){
		return adresa;
	}

	public String getBrojTelefona(){
		return brojTelefona;
	}

	public String getIme(){
		return ime;
	}

	public int getJmbg(){
		return jmbg;
	}

	public String getKorisnickoIme(){
		return korisnickoIme;
	}

	public String getLozinka(){
		return lozinka;
	}

	public Pol getPol(){
		return pol;
	}

	public String getPrezime(){
		return prezime;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public boolean Login(String username, String password){
		return false;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAdresa(String newVal){
		adresa = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBrojTelefona(String newVal){
		brojTelefona = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIme(String newVal){
		ime = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setJmbg(int newVal){
		jmbg = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setKorisnickoIme(String newVal){
		korisnickoIme = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLozinka(String newVal){
		lozinka = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPol(Pol newVal){
		pol = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPrezime(String newVal){
		prezime = newVal;
	}

}