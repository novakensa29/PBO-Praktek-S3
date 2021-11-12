package soal3;

public class Commission extends Hourly 
{
	double totalSale;
	double commissionRate;
	
	
	
	public Commission(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double commision)
	{
		super (eName, eAddress, ePhone, socSecNumber, rate);
		commissionRate = commision;
	}
	
	public void addSales(double totalSales)
	{
		totalSale = commissionRate * totalSales;
	}
	
	public double pay()
	{
		double payment = super.pay() + totalSale;
		totalSale = 0;
		return payment;
	}
	
	public String toString()
	{
		String result = super.toString();
		
		result += "\ntotal sales: " + totalSale;
		
		return result;
	}
}
