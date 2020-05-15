package model;

/**
 * @author Goran
 * @version 1.0
 * @created 12-May-2020 9:53:28 PM
 */
public class Automobil {

	private int godiste;
	private Marka marka;
	private Model model;
	private int snaga;
	private Musterija vlasnik;
	private String vrstaGoriva;
	private int zapreminaMotora;
	public ServisnaKnjizica m_ServisnaKnjizica;

	public Automobil(){

	}

	public void finalize() throws Throwable {

	}

	public int getGodiste(){
		return godiste;
	}

	public Marka getMarka(){
		return marka;
	}

	public Model getModel(){
		return model;
	}

	public int getSnaga(){
		return snaga;
	}

	public Musterija getVlasnik(){
		return vlasnik;
	}

	public String getVrstaGoriva(){
		return vrstaGoriva;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setGodiste(int newVal){
		godiste = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setMarka(Marka newVal){
		marka = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setModel(Model newVal){
		model = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSnaga(int newVal){
		snaga = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setVlasnik(Musterija newVal){
		vlasnik = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setVrstaGoriva(String newVal){
		vrstaGoriva = newVal;
	}

}