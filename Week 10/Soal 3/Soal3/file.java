package Soal3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
	public static void main(String[] args) throws FileNotFoundException 
	{
        String fileName = null ; 
        try 
        {
        	//membaca file
        	File myFile = new File("src/text");
       		Scanner fileReader = new Scanner(myFile);
        
       		//menulis isi file
       		while(fileReader.hasNextLine()){
       			String data = fileReader.nextLine();
       			System.out.println(data);
       		}
            
       	} 
        catch (FileNotFoundException e) 
       	{
       		System.out.println(e.getMessage());
       	}
	}
}
