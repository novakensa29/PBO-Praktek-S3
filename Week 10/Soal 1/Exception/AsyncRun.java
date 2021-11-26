package Exception;

public class AsyncRun implements Runnable { 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("AsyncRun.run on thread " +
					Thread.currentThread().getId());
			throw new ArithmeticException();
			//throws berfungsi untuk mendeklarasikan exception
			//ArithmeticException berfungsi untuk menangani masalah pada perhitungan
		}catch(Exception ex) {
			System.out.println( ex + " handled run" );
		}
		
	}
	 
	 public static void main( String[] args ) {
			try {
				Thread t = new Thread(new AsyncRun());
				t.start();
				System.out.println( "main on thread " + Thread.currentThread().getId());
				throw new NullPointerException();
				//
			}
			catch(Exception ex)
			{
				System.out.println(ex.getClass().getName() + " handled");
			}
		}
}	
	
