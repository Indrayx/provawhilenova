import java.util.Locale;
import java.util.Scanner;
public class custo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horas,thoras,opçmen;
		double vph,custo,caro1,caro2;
		char opçao;
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
		opçao = sc.next().charAt(0);
		
		while (opçao == 's' || opçao == 'S') { 
			System.out.print("Nome:");
			nome = sc.next();
			System.out.print("Horas trabalhadas:");
			horas = sc.nextInt();
			System.out.print("Valor por hora:");
			vph = sc.nextDouble();
			System.out.print("digitar outro(S/N)?");
			opçao = sc.next().charAt(0);
			thoras=thoras + horas;
			custo = custo + (vph*horas);
			
		}
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair");
		System.out.print("Digite uma opção:");
		opçmen = sc.nextInt();
		
while(opçmen != 4) {
			
			if(opçmen == 1) {
			System.out.println(" Total de horas = " + thoras);
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção:");
			opçmen = sc.nextInt();
							
						
				
			}
			if(opçmen == 2) {
				System.out.printf("Custo total = R$%.2f%n", custo);
				System.out.println("MENU");
				System.out.println("1 - Total de horas trabalhadas");
				System.out.println("2 - Custo total");
				System.out.println("3 - Nome da pessoa que ganhou mais");
				System.out.println("4 - Sair");
				System.out.print("Digite uma opção:");
				opçmen = sc.nextInt();
				
				
			}
			if (opçmen > 4 || opçmen < 0 ) {
				System.out.println("MENU");
				System.out.println("1 - Total de horas trabalhadas");
				System.out.println("2 - Custo total");
				System.out.println("3 - Nome da pessoa que ganhou mais");
				System.out.println("4 - Sair");
				System.out.print("Digite uma opção:");
				opçmen = sc.nextInt();
			}
		
		
		if(opçmen == 4) {
			System.out.println("FIM DO PROGRAMA!");
		}
		
		
		
		
		sc.close();

	}

}
