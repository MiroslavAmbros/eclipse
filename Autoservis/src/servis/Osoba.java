package servis;

public class Osoba extends Object {

	private String ime;
	private String prezime;
	private String oib;
	private String brojtelefona;
	private String iban;
	public Osoba() {
		
	}
	public Osoba(String ime, String prezime, String oib, String brojtelefona) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.oib = oib;
		this.brojtelefona = brojtelefona;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	public String getBrojtelefona() {
		return brojtelefona;
	}
	public void setBrojtelefona(String brojtelefona) {
		this.brojtelefona = brojtelefona;
	
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
}
