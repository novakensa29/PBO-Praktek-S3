import java.io.*;
public class guru {
	private int NIP;
	private String Nama;
	private String mapel;
	private String jenis_kelamin;
	
	public guru (int NIP, String Nama, String mapel, String jenis_kelamin) {
		this.NIP = NIP;
		this.Nama = Nama;
		this.mapel = mapel;
		this.jenis_kelamin = jenis_kelamin;
	}
	
	public void setNIM (int NIP) {
		this.NIP = NIP;
	}
	
	public int getNIP() {
		return NIP;
	}
	
	public void setNama (String Nama) {
		this.Nama = Nama;
	}
	
	public String getNama() {
		return Nama;
	}
	
	public void setmapel(String mapel) {
		this.mapel = mapel;
	}
	
	public String getmapel () {
		return mapel;
	}
	
	public void setjenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	
	public String getjenis_kelamin() {
		return jenis_kelamin;
	}
}
