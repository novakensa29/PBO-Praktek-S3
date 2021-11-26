package Soal3;

public class VariableReference {
	public static void main (String [] args) {
		String hewan;
		try {
			hewan = new String();
			System.out.println("nama hewan :" + hewan);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
