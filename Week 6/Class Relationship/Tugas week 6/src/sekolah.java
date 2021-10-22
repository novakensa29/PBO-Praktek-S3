import java.io.*;
import java.util.*;

public class sekolah {
	private String Sekolah;
	private String kepalaSekolah;
	private List<kelas> kelas;
	
	public sekolah (String Sekolah, String kepalaSekolah, List<kelas> kelas) {
		this.Sekolah = Sekolah;
		this.kepalaSekolah = kepalaSekolah;
		this.kelas = kelas;
	}
	
	public void setSekolah(String Sekolah) {
		this.Sekolah = Sekolah;
	}
	
	public String getSekolah() {
		return Sekolah;
	}
	
	public void setkepalaSekolah(String kepalaSekolah) {
		this.kepalaSekolah = kepalaSekolah;
	}
	
	public String getkepalaSekolah() {
		return kepalaSekolah;
	}
	
	public List<kelas> getkelas(){
		return kelas;
	}
	
	public int getTotalMurid() {
		int nomor = 0;
		List<murid> murid;
		for(kelas k:kelas) {
			murid = k.getmurid();
			for(murid m:murid) {
				nomor++;
			}
		}
		return nomor;
	}
}
