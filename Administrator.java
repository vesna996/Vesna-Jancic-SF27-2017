

/**
 * @author Vesna
 * @version 1.0
 * @created 12-May-2020 9:53:28 PM
 */
public class Administrator extends Korisnik {

	private double plata;

	public Administrator(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public double getPlata(){
		return plata;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param id
	 * @param address
	 * @param phone
	 */
	public Administrator Register(String username, String password, String firstName, String lastName, Pol gender, int id, String address, String phone){
		return null;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param id
	 * @param address
	 * @param phone
	 */
	public Musterija RegisterMusterija(String username, String password, String firstName, String lastName, Pol gender, int id, String address, String phone){
		return null;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param id
	 * @param address
	 * @param phone
	 */
	public Serviser RegisterServiser(String username, String password, String firstName, String lastName, Pol gender, int id, String address, String phone){
		return null;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPlata(double newVal){
		plata = newVal;
	}

}