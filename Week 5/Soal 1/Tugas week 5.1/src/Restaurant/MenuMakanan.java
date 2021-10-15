package Restaurant;

public class MenuMakanan {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	MenuMakanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int[10];
	}
	
	public void setnama_makanan(String nama, byte id) {
		this.nama_makanan[id] = nama;
	}
	
	public String getnama_makanan(byte id) {
		return nama_makanan[id];
	}
	public void setharga_makanan(double harga,byte id) {
		this.harga_makanan[id] = harga;
	}
	public double getharga_makanan(byte id) {
		return harga_makanan[id];
	}
	public void setstok(int stok, byte id) {
		this.stok[id] += stok;
	}
	public int getstok(byte id) {
		return stok[id];
	}
	public void kurangstok(byte id, int jumlah_makanan) {
		this.stok[id] -= jumlah_makanan;
	}
}
