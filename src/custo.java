import java.util.Locale;
import java.util.Scanner;
public class custo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horas,thoras,op�men;
		double vph,custo,caro1,caro2;
		char op�ao;
		thoras=0;
		custo=0;		
		
		System.out.print("Nome:");
		nome = sc.next();
		System.out.print("Horas trabalhadas:");
		horas = sc.nextInt();
		System.out.print("Valor por hora:");
		vph = sc.nextDouble();
		thoras=thoras + horas;
		custo = custo + (vph*horas);
		System.out.print("digitar outro(S/N)?");
		op�ao = sc.next().charAt(0);
		
		while (op�ao == 's' || op�ao == 'S') { 
			System.out.print("Nome:");
			nome = sc.next();
			System.out.print("Horas trabalhadas:");
			horas = sc.nextInt();
			System.out.print("Valor por hora:");
			vph = sc.nextDouble();
			System.out.print("digitar outro(S/N)?");
			op�ao = sc.next().charAt(0);
			thoras=thoras + horas;
			custo = custo + (vph*horas);
			
		}
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair");
		System.out.print("Digite uma op��o:");
		op�men = sc.nextInt();
		
while(op�men != 4) {
			
			if(op�men == 1) {
			System.out.println(" Total de horas = " + thoras);
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma op��o:");
			op�men = sc.nextInt();
							
						
				
			}
			if(op�men == 2) {
				System.out.printf("Custo total = R$%.2f%n", custo);
				System.out.println("MENU");
				System.out.println("1 - Total de horas trabalhadas");
				System.out.println("2 - Custo total");
				System.out.println("3 - Nome da pessoa que ganhou mais");
				System.out.println("4 - Sair");
				System.out.print("Digite uma op��o:");
				op�men = sc.nextInt();
				
				
			}
			if (op�men > 4 || op�men < 0 ) {
				System.out.println("MENU");
				System.out.println("1 - Total de horas trabalhadas");
				System.out.println("2 - Custo total");
				System.out.println("3 - Nome da pessoa que ganhou mais");
				System.out.println("4 - Sair");
				System.out.print("Digite uma op��o:");
				op�men = sc.nextInt();
			}
		
		
		if(op�men == 4) {
			System.out.println("FIM DO PROGRAMA!");
		}
		
		
		
		
		sc.close();

	}

}
