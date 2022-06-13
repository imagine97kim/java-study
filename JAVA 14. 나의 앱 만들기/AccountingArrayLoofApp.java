
public class AccountingArrayLoofApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double totalPrice = valueOfSupply + vat;
		double Expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - Expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double[] dividend = new double[3];
		dividend[0] = income * dividendRates[0];
		dividend[1] = income * dividendRates[1];
		dividend[2] = income * dividendRates[2];
		
		
		System.out.println("Value of Supply: " + valueOfSupply);
		System.out.println("VAT: " + vat);
		System.out.println("Total Price: " + totalPrice);
		System.out.println("Expense: " + Expense );
		System.out.println("Income: " + income);
		
		int i = 0;
		while(i < dividend.length) {
			System.out.println("Dividend " + i + ": " + dividend[i]);
			i++;
		}
		

	}

}
