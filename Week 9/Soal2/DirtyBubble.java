package Soal2;

import java.util.*;

public class DirtyBubble extends SuperHero 
{
	public DirtyBubble(int level, String Name)
	{
		super(level, Name);
		Power strength = new Strength();
		Power fly = new Flying();
		super.addPower(strength);
		super.addPower(fly);
	}
	
	public void identity()
	{
		System.out.println("It's " + super.getName() + "the DirtyBubble! It has the power level of " + super.getPowerLevel());
		System.out.println(". . . . .HEED ME. . . . .");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName());
		
	}
}
