package Restaurant;

//Syarat OOP
//1. Selalu membuat data dalam keadaan private
//2. Selalu menginitialisasi data
//3. Jangan terlalu banya menggunakan data dasar (berulang) bisa saja disatukan dalam satu variabel data


public class Restaurant {
	private MenuMakanan Makanan;
	private static byte id=0;

	public Restaurant() {
		Makanan = new MenuMakanan();
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		Makanan.setharga_makanan(harga, id);
		Makanan.setnama_makanan(nama, id);
		Makanan.setstok(stok, id);
		id++;
	}

	public void tampilMenuMakanan(){
		for(byte i =0; i<=id;i++){
			if(!isOutOfStock(i)){
				System.out.println(i+"." + Makanan.getnama_makanan(i) +"["+Makanan.getstok(i)+"]"+"\tRp. "+Makanan.getharga_makanan(i));
			}
		}
	}
		
	public boolean isOutOfStock(byte id){
		if(Makanan.getstok(id) == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void pemesanan(int ID, int jumlah_makanan) {
		byte id = (byte) ID;
		if(jumlah_makanan < 0) {
			System.out.println("Jumlah tidak bisa dipesan");
		}else if (jumlah_makanan > Makanan.getstok(id)) {
			System.out.println("Jumlah melebihi stok");
		}
		
		if((Makanan.getstok(id) - jumlah_makanan) < 0 ) {
			System.out.println("Stok habis");
		} else {
			System.out.println("Pesanan : " + Makanan.getnama_makanan(id) + "["+ jumlah_makanan+"]" + "Total Harga Rp." + Makanan.getharga_makanan(id)*jumlah_makanan);
			Makanan.kurangstok(id, jumlah_makanan);
		}
	}
}
