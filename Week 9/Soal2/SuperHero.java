package Soal2;

import java.util.*;

public abstract class SuperHero {
	private int powerLevel;
	private String name;
	private List<Power> powerList;
	
	public SuperHero(int level, String Name)
	{
		this.powerLevel = level;
		this.name = Name;
		this.powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel()
	{
		return powerLevel;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addPower(Power power)
	{
		powerList.add(power);
	}
	
	abstract public void identity();
	
	public void showPower()
	{
		System.out.println("TIME TO SHOW YOU MU POWERS");
		for(Power power : powerList)
		{
			power.doPower();
		}
	}
	
}
