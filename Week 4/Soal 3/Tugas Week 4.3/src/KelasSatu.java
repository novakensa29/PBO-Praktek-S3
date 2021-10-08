//variabel statis akan mendapatkan memori hanya sekali, 
//jika ada objek yang mengubah nilai variabel statis, 
//itu akan mempertahankan nilainya.

class KelasSatu{
	{
		System.out.println(11);
	}
	
static{
	System.out.println(2);
		}

	public KelasSatu(int i)
	{
	System.out.println(3);
}
	
	public KelasSatu()
	{
	System.out.println(4);
	}
}
