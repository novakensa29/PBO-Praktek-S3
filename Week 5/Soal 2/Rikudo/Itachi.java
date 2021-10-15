
public class Itachi extends Rikudo {
	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;

	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}

	void printDojutsu() {
		System.out.println(super.Dojutsu);
		//setDojutsu(); //memanggil setdojutsu terlebih dahulu
		System.out.println(this.Dojutsu);
	}

	public void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";
	}
}