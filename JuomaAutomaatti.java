
public class JuomaAutomaatti {
	private int teetä;
	private int kahvia;
	private int kaakaota;
	
	public JuomaAutomaatti() {
		this.teetä = 50;
		this.kahvia = 50;
		this.kaakaota = 50;
	}
	
	public int getTeetä() {
		return this.teetä;
	}
	
	public void setTeetä(int uusiMääräTeetä) {
		this.teetä = uusiMääräTeetä;
	}
	
	public int getKahvia() {
		return this.kahvia;
	}
	
	public void setKahvia(int uusiMääräKahvia) {
		this.kahvia = uusiMääräKahvia;
	}
	
	public int getKaakaota() {
		return this.kaakaota;
	}
	
	public void setKaakaota(int uusiMääräKaakaota) {
		this.kaakaota = uusiMääräKaakaota;
	}
	
	public String toString() {
		String tuloste = "Teetä on jäljellä: " + this.getTeetä() +
				"Kahvia on jäljellä:" + this.getKahvia() +
				"Kaakaota on jäljellä: " + this.getKaakaota() + ".";
		return tuloste;
	}
	
	public void valmistaKahvi() {
		System.out.println("Odota hetki, kahvisi valmistuu");
		if (this.kahvia >= 10) {
				this.kahvia -= 10;
			} else {
				System.out.println("Kahvia ei ole enää jäljellä! Täytä säiliö.");
			}
	}
	
	public void valmistaTee() {
		System.out.println("Odota hetki, teesi valmistuu");
		if (this.teetä >= 10) {
				this.teetä -= 10;
			} else {
				System.out.println("Teetä ei ole enää jäljellä! Täytä säiliö.");
			}
	}
	
	public void valmistaKaakao() {
		System.out.println("Odota hetki, kaakaosi valmistuu");
		if (this.kaakaota >= 10) {
				this.kaakaota -= 10;
			} else {
				System.out.println("Kaakaota ei ole enää jäljellä! Täytä säiliö.");
			}
	}
}
