package servis;

public class Vozilo extends Vlasnik {

	private String registracija;
	private String brojsasije;
	private String kilometraza;
	public String getRegistracija() {
		return registracija;
	}
	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}
	public String getBrojsasije() {
		return brojsasije;
	}
	public void setBrojsasije(String brojsasije) {
		this.brojsasije = brojsasije;
	}
	public String getKilometraza() {
		return kilometraza;
	}
	public void setKilometraza(String kilometraza) {
		this.kilometraza = kilometraza;
	}
}

