package Restaurant;
import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner (System.in);
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);

		System.out.println("Menu Pesanan Customer\n");
		menu.tampilMenuMakanan();
		System.out.println("pilih nomor makanan : ");
		a=input.nextInt();
		System.out.println("Jumlah yang dipesan : ");
		b=input.nextInt();
		menu.pemesanan(a, b);
		
	}
}