import java.io.*;
import java.util.*;

public class kelas {
	private int tingkatKelas;
	private String Kelas;
	private List <murid> murid;
	private List <guru> guru;
	
	public kelas(int tingkatKelas,String Kelas, List <murid> murid, List <guru> guru) {
		this.tingkatKelas = tingkatKelas;
		this.Kelas = Kelas;
		this.murid = murid;
		this.guru = guru;
	}
	
	public void settingkatKelas(int tingkatKelas) {
		this.tingkatKelas = tingkatKelas;
	}
	
	public int gettingkatKelas() {
		return tingkatKelas;
	}
	
	public void setKelas (String Kelas) {
		this.Kelas = Kelas;
	}
	
	public String getKelas() {
		return Kelas;
	}
	
	public List<murid> getmurid(){
		return murid;
	}
	
	public List<guru> getguru(){
		return guru;
	}
}
