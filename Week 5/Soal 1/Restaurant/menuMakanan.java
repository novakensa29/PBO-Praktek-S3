package Restaurant;

public class menuMakanan {
		private String[] nama_makanan;
		private double[] harga_makanan;
		private int[] stok;
		menuMakanan() {
			this.nama_makanan = new String[10];
			this.harga_makanan = new double[10];
			this.stok = new int[10];
		}
		public void setNama_makanan(String nama, byte id) {
			this.nama_makanan[id] = nama;
		}
		public String getNama_makanan(byte id) {
			return nama_makanan[id];
		}
		public void setHarga_makanan(double harga,byte id) {
			this.harga_makanan[id] = harga;
		}
		public double getHarga_makanan(byte id) {
			return harga_makanan[id];
		}
		public void setStok(int stok, byte id) {
			this.stok[id] += stok;
		}
		public int getStok(byte id) {
			return stok[id];
		}
		public void ambilStok(byte id, int jumlah_pesan) {
			this.stok[id] -= jumlah_pesan;
		}
}