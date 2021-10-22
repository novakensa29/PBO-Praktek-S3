import java.util.*;
import java.io.*;

public class tampil {
	public static void tampilmurid(murid murid) {
		System.out.println("\n===== DAFTAR MURID =====");
		System.out.println("NIM		:"+murid.getNIM());
		System.out.println("Nama		:"+murid.getNama());
		System.out.println("Role		:"+murid.getrole());
		System.out.println("Jenis Kelamin	:"+murid.getjenisKelamin());
	}
	
	public static void tampilguru(guru guru) {
		System.out.println("\n===== DAFTAR GURU =====");
		System.out.println("NIP		:"+guru.getNIP());
		System.out.println("Nama		:"+guru.getNama());
		System.out.println("Mata Pelajaran	:"+guru.getmapel());
		System.out.println("Jenis Kelamin	:"+guru.getjenis_kelamin());
		System.out.println("=======================\n");
	}
	
	public static void tampilkelas(kelas kelas) {
		List<murid> murid1 = kelas.getmurid();
		List<guru> guru1 = kelas.getguru();
		System.out.println("\n===== DAFTAR KELAS =====");
		System.out.println("Tingkat		: tahun ke-"+kelas.gettingkatKelas());
		System.out.println("Kelas		: Kelas " +kelas.getKelas());
		System.out.println("========================\n");
		for(guru g:guru1) {
			tampilguru(g);
			for(murid m:murid1) {
				tampilmurid(m);
			}
		}
	}
	
	public static void tampilsekolah (sekolah sekolah) {
		List<kelas> kelas1 = sekolah.getkelas();
		System.out.println("===== SEKOLAH =====");
		System.out.println("Sekolah		:"+sekolah.getSekolah());
		System.out.println("Kepala Sekolah	:"+sekolah.getkepalaSekolah());
		System.out.println("===================\n");
		for(kelas k:kelas1) {
			tampilkelas(k);
		}
	}
}
