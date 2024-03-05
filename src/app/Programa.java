package app;

import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Entre com o numero de funcionarios: ");
		int n = sc.nextInt();

		Funcionario[] lista = new Funcionario[n];

		for (int i = 0; i < n; i++) {
			
			System.out.println("Funcionario #" + (i + 1) + ": ");
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Horas Trabalhadas: ");
			Integer horas = sc.nextInt();
			System.out.println("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			System.out.println("Terceirizado? (y/n): ");
			String input = sc.next();

			if (input.charAt(0) == 'n') {
				lista[i] = new Funcionario(nome, horas, valorPorHora);
			} else if (input.charAt(0) == 'y') {
				System.out.println("Despesa: ");
				Double despesaAdicional = sc.nextDouble();
				lista[i] = new FuncionarioTerceirizado(nome, horas, valorPorHora, despesaAdicional);
			} else {
				System.out.println("Invalido");
			}
		}

		System.out.println("Pagamentos: ");
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].nome + " - $ " + lista[i].pagamento());
			
		}
		
		
		sc.close();
	}

}
