//Class Barang berfungsi untuk mendefiniskan struktur data yang diperlukan oleh Objek Barang.

public class Barang {
		String kode_barang;
		String nama_barang;
		private int stok;

		public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
		}
		
		public void setstok (int stok)
		{
			this.stok += stok;
		}
		public int getstok ()
		{
			return this.stok;
		}
}
