package entidades;

public class Funcionario {
	
	public String nome;
	public Integer horas;
	public Double valorPorHora;
	public Double salario;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}


	public double pagamento() {
		return valorPorHora * horas;
	}
	
}
