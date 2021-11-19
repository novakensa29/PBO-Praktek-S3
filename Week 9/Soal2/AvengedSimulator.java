package Soal2;

import java.util.*;

public class AvengedSimulator {
	public static void addSuperHero(List<SuperHero> sh,String name,int level,String hero) {
		SuperHero SH = null;
		switch(hero) {
			case "FlyingDutchMan":
				SH = new FlyingDutchMan(level, name);
				break;
			case "ManRay":
				SH = new ManRay(level, name);
				break;
			case "DirtyBubble":
				SH = new DirtyBubble(level, name);
				break;
		}
		sh.add(SH);
	}
	
	public static void main(String[] args) {
		 List<SuperHero> superhero = new ArrayList<SuperHero>();
		 addSuperHero(superhero, "Gennichiro", 0, "ManRay");
		 addSuperHero(superhero, "Shirai", 255, "FlyingDutchMan");
		 addSuperHero(superhero, "Gyoubu Masataka Oniwa", 553, "ManRay");
		 addSuperHero(superhero, "Tatenari", 36556, "FlyingDutchMan");
		 addSuperHero(superhero, "Arnastria", 666, "DirtyBubble");
		 
		 for (SuperHero s : superhero) {
			 System.out.println("===============================");
			 s.identity();
			 s.showPower();
			 System.out.println("===============================");
		 }
//		 superhero.get(1).identity();
	}
}