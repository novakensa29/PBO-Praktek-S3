package Hexadecimal;

import java.util.Scanner;  

public class Hexadecimal {  
	public static boolean hexadecimal(String Hexadecimal) {
		boolean hex;
		try 
			{
			Integer.parseInt(Hexadecimal, 16);
			return hex = true;
			}
		catch (NumberFormatException e) 
		   {
	         return hex = false;  
		   } 
	 }  
   
	public static int inthexadecimal(String Hexadecimal) {
		try 
			{
			
			return Integer.parseInt(Hexadecimal, 16);
			}
		catch (NumberFormatException e) 
		   {
	         return 0;  
		   } 
	 }  
	
   public static void main(String[] args) { 
	   String hexadecimal = null;
	   try(Scanner input = new Scanner(System.in))
	   { 
	        while(true)
	        {
	        	System.out.println("Masukkan nilai Hexadesimal : ");
	        	hexadecimal = input.nextLine();
	        	boolean h = hexadecimal(hexadecimal);
	        	System.out.println("Termasuk hexadecimal : " + h);
	        	int x = inthexadecimal(hexadecimal);
	        	System.out.println("Hasil : " + x + "\n");
	        }
	        
	   } 
   }
   
}
