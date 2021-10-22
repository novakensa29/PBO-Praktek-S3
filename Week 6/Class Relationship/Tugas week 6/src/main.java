import java.io.*;
import java.util.*;

public class main {
	public static void main(String[] args) {
		murid m1 = new murid(20121,"Harry Potter","Ketua Kelas","Pria");
		murid m2 = new murid(20126,"Draco Malfoy","Ketua Kelas","Pria");
		murid m3 = new murid(20131,"Cho Cang","Ketua Kelas","Perempuan");
		murid m4 = new murid(20136,"Cedric Diggory","Ketua Kelas","Pria");
		
		murid m5 = new murid(20122,"Hermione Granger","Bedahara","Perempuan");
		murid m6 = new murid(20127,"Daphne Greengrass","Bendahara","Perempuan");
		murid m7 = new murid(20132,"Padma Patil","Bendahara","Perempuan");
		murid m8 = new murid(20137,"Hannah Abbott","Bendahara","Perempuan");
		
		murid m9 = new murid(20123,"Ginny Wesley","Sekertaris","Perempuan");
		murid m10 = new murid(20128,"Blaise Zabini","Sekertaris","Pria");
		murid m11 = new murid(20133,"Penelope Clearwater","Sekertaris","Perempuan");
		murid m12 = new murid(20138,"Zacharias Smith","Sekertaris","Pria");
		
		murid m13 = new murid(20124,"Ron Wesley","Anggota Kelas","Pria");
		murid m14 = new murid(20129,"Gregory Goyle","Anggota Kelas","Pria");
		murid m15 = new murid(20134,"Anthony Goldstein","Anggota Kelas","Pria");
		murid m16 = new murid(20139,"Ernie Macmillan","Anggota Kelas","Pria");
		
		murid m17 = new murid(20125,"Parvati Patil","Anggota Kelas","Perempuan");
		murid m18 = new murid(20130,"Pansy Parkinson","Anggota Kelas","Perempuan");
		murid m19 = new murid(20135,"Luna Lovegood","Anggota Kelas","Perempuan");
		murid m20 = new murid(20140,"Susan Bones","Anggota Kelas","Perempuan");
		
		List<murid> Gryffindor = new ArrayList<murid> ();
		Gryffindor.add(m1);
		Gryffindor.add(m5);
		Gryffindor.add(m9);
		Gryffindor.add(m13);
		Gryffindor.add(m17);
		
		List<murid> Slytherin = new ArrayList<murid> ();
		Slytherin.add(m2);
		Slytherin.add(m6);
		Slytherin.add(m10);
		Slytherin.add(m14);
		Slytherin.add(m18);
		
		List<murid> Ravenclaw = new ArrayList<murid> ();
		Ravenclaw.add(m3);
		Ravenclaw.add(m7);
		Ravenclaw.add(m11);
		Ravenclaw.add(m15);
		Ravenclaw.add(m19);
		
		List<murid> Hufflepuff = new ArrayList<murid> ();
		Hufflepuff.add(m4);
		Hufflepuff.add(m8);
		Hufflepuff.add(m12);
		Hufflepuff.add(m16);
		Hufflepuff.add(m20);
		
		guru g1 = new guru(1001,"Severus Snape","Posion","Pria");
		guru g2 = new guru(1002,"Minerva McGonagall","Transfiguration","Perempuan");
		guru g3 = new guru(1003,"Filius Flitwick","Charms","Pria");
		guru g4 = new guru(1004,"Pomona Sprout","Herbology","Perempuan");
		
		List<guru> Gryffindor1 = new ArrayList<guru> ();
		Gryffindor1.add(g2);
		
		List<guru> Slytherin1 = new ArrayList<guru> ();
		Slytherin1.add(g1);
		
		List<guru> Ravenclaw1 = new ArrayList<guru> ();
		Ravenclaw1.add(g3);
		
		List<guru> Hufflepuff1 = new ArrayList<guru> ();
		Hufflepuff1.add(g4);

		kelas k1 = new kelas(3,"Gryffindor",Gryffindor,Gryffindor1);
		kelas k2 = new kelas(3,"Slytherin",Slytherin,Slytherin1);
		kelas k3 = new kelas(3,"Slytherin",Ravenclaw,Ravenclaw1);
		kelas k4 = new kelas(3,"Hufflepuff",Hufflepuff,Hufflepuff1);
		
		List<kelas> k5 = new ArrayList<kelas> ();
		k5.add(k1);
		k5.add(k2);
		k5.add(k3);
		k5.add(k4);
		
		sekolah s1 = new sekolah("Hogwarts School","Albus Dumbledore",k5);
		
		tampil.tampilsekolah(s1);
		//System.out.println("Total Murid		:"+sekolah.getTotalMurid());
	}
}
