package Restaurant;
public class Restaurant {
	private menuMakanan menu;
	private static byte idMenu = 0;
	public Restaurant() {
		menu = new menuMakanan();
	}
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		menu.setHarga_makanan(harga, idMenu);
		menu.setNama_makanan(nama, idMenu);
		menu.setStok(stok, idMenu);
		idMenu++;
	}
	public void tampilMenuMakanan(){
		for(byte i =0; i<=idMenu;i++){
			if(!isOutOfStock(i)){
				System.out.println(i +"| "+menu.getNama_makanan(i) +"["+ menu.getStok(i) +"]"+"\t\tRp. "+ menu.getHarga_makanan(i));
			}
		}
	}
	public boolean isOutOfStock(byte id){
		if(menu.getStok(id) == 0){
			return true;
		}else{
			return false;
		}
	}
	public void pemesanan(int ID, int jumlah_pesan) {
		byte id = (byte) ID;
		if(jumlah_pesan < 0)
			System.out.println("Jumlah tidak bisa dipesan");
		if((menu.getStok(id) - jumlah_pesan) < 0 )
			System.out.println("Stok habis");
		else {
			System.out.println("Pesanan anda : " + menu.getNama_makanan(id) + " sebanyak " + jumlah_pesan);
			System.out.println("Total Harga Rp." + menu.getHarga_makanan(id)*jumlah_pesan);
			menu.ambilStok(id, jumlah_pesan);
			System.out.println("======================");
		}
	}
}