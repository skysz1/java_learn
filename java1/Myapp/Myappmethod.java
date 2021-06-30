
public class Myappmethod {
	
	public static double Valueofsupply;
	public static double vatrate;
	private static double expenseRate;
	public static void main(String[] args) {
		
		Valueofsupply = 10000.0;
		vatrate = 0.1;
		expenseRate = 0.3;
		double vat = getVAT();
		double total = getTotal();
		double expense = getExpense();
		double income = getIncome();
		double dividend1 = getDividend1();
		double dividend2 = getDividend2();
		double dividend3 = getDividend3();
		
		
		print();
		
		
	}

	private static void print() {
		System.out.println("Value of supply : "+ Valueofsupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}	
	private static double getDividend2() {
		return getIncome() * 0.3;
	}		
	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return Valueofsupply - getExpense();
	}

	private static double getExpense() {
		return Valueofsupply*expenseRate;
	}

	private static double getTotal() {
		return Valueofsupply+ getVAT();
	}

	private static double getVAT() {
		return Valueofsupply*vatrate;
	}

}
