package entidades;

public class Funcionario {
	private String nome;
	private double salario;
	private int id;
	
	public Funcionario(String nome , double salarion,int id) {
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getId() {
		return id;
	}

	public void aumentarsalario(double porcentagem) {
		this.salario += salario * porcentagem;
	}
}
