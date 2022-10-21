package entities;

public class TaxPayer {

	public double salaryIncome;
	public double servicesIncome;
	public double capitalIncome;
	public double healthSpending;
	public double educationSpending;
	
	public TaxPayer() {
	}

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double salary = salaryIncome / 12;
		if(salary > 3000 && salary < 5000) {
			return salaryIncome * 0.1;
		} if(salary >= 5000) {
			return salaryIncome * 0.2;
		} else {
			return salaryIncome * 0.0;
		}
	}
	
	public double servicesTax() {
		return servicesIncome * 0.15;
	}
	
	public double capitalTax() {
		return capitalIncome * 0.2;
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		double tax = grossTax() * 0.3;
		double spending = healthSpending + educationSpending;
		if(spending < tax) {
			return spending;
		} else {
			return tax;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
}