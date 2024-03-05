package entidades;

public class FuncionarioTerceirizado extends Funcionario{

	public Double despesaAdicional;

	
	
	
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	
	
	@Override
	public double pagamento() {
		return (valorPorHora * horas) + (despesaAdicional += despesaAdicional * 0.1);
	}
	
}
