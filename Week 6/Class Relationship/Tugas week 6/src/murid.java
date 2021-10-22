import java.io.*;
public class murid {
		private int NIM;
		private String Nama;
		private String role;
		private String jenisKelamin;
		
		public murid (int NIM, String Nama, String role, String jenisKelamin) {
			this.NIM = NIM;
			this.Nama = Nama;
			this.role = role;
			this.jenisKelamin = jenisKelamin;
		}
		
		public void setNIM (int NIM) {
			this.NIM = NIM;
		}
		
		public int getNIM() {
			return NIM;
		}
		
		public void setNama (String Nama) {
			this.Nama = Nama;
		}
		
		public String getNama() {
			return Nama;
		}
		
		public void setrole(String role) {
			this.role = role;
		}
		
		public String getrole () {
			return role;
		}
		
		public void setjenisKelamin(String jenisKelamin) {
			this.jenisKelamin = jenisKelamin;
		}
		
		public String getjenisKelamin() {
			return jenisKelamin;
		}
}
