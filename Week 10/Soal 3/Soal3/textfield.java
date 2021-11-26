package Soal3;

import java.util.Scanner;

public class textfield {
	public static void main(String args[])
	{
		String nama;
		int kelas;
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.println("nama : ");
        	nama = input.nextLine();
        	System.out.println("kelas : ");
        	kelas = input.nextInt();
	    }
		catch(Exception e)
		{
			System.out.println(e + " Kelas harus bertipe integer");
	    }
   }
}

