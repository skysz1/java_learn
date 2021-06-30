class Accounting {
	public double Valueofsupply;
	public double vatrate;
	public double expenseRate;
	public void print() {
		System.out.println("Value of supply : "+ Valueofsupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	private double getDividend1() {
		return getIncome() * 0.5;
	}	
	private double getDividend2() {
		return getIncome() * 0.3;
	}		
	private double getDividend3() {
		return getIncome() * 0.2;
	}

	private double getIncome() {
		return Valueofsupply - getExpense();
	}

	private double getExpense() {
		return Valueofsupply*expenseRate;
	}

	private double getTotal() {
		return Valueofsupply+ getVAT();
	}

	private double getVAT() {
		return Valueofsupply*vatrate;
	}
}
public class MyappClass {
	
	public static void main(String[] args) {
		
		Accounting a1 = new Accounting();
		a1.Valueofsupply = 10000.0;
		a1.vatrate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
	
		Accounting a2 = new Accounting();
		a2.Valueofsupply = 10000.0;
		a2.vatrate = 0.1;
		a2.expenseRate = 0.3;
		a2.print();
		
		
	}
}
