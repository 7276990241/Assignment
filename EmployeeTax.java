package com.cognizant.tax;

public class EmployeeTax {
	public static void main(String[] args)
	{
		TaxCalculator employee1 = new TaxCalculator(25000,true);
		employee1.calculateTax();
		employee1.deductTax();
		employee1.validateSalary();
		
		TaxCalculator employee2 = new TaxCalculator(125000,true);
		employee2.calculateTax();employee2.deductTax();employee2.validateSalary();
	}

}
