package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		TaxPayer taxPayer = new TaxPayer();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + i + "° contribuinte:");
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			
			taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			
			list.add(taxPayer);
		}
		
	
			
		
		for(TaxPayer tp : list ) {
			
			System.out.println();
			System.out.println("Resumo do contribuinte:");
			System.out.printf("Imposto bruto total: %.2f%n", tp.grossTax());
			System.out.printf("Abatimento: %.2f%n", tp.taxRebate());
			System.out.printf("Imposto devido: %.2f%n", tp.netTax());
		}
	
		
		sc.close();
	}
}