package Restaurant;
import java.util.*;
public class RestaurantMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x,y;
		boolean jawab =true;
		String jawaban;
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		menu.tampilMenuMakanan();
		while (jawab ==true) {
		System.out.println("Masukkan ID pesanan     : ");
		x = keyboard.nextInt();
		System.out.println("Masukkan jumlah pesanan : ");
		y = keyboard.nextInt();
		menu.pemesanan(x,y);
		menu.tampilMenuMakanan();
		System.out.println("Ingin Memesan lagi [Y/N]? :");
		jawaban = keyboard.nextLine();
			if(jawaban == "N" || jawaban == "n") {
				jawab=false;
			}
		}
	}
}