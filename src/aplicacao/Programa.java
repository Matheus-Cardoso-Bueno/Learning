package aplicacao;
import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;
import java.util.List;
import java.util.ArrayList;
public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<Funcionario>();
		
		System.out.print("Quantos funcionarios vao ser cadastrados");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1;i<= qtd; i++) {
			System.out.printf("Funcionario #%d:%n",qtd);
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			list.add(new Funcionario(nome, salario, id));
		}
		System.out.print("coloque o id do funcionario q vai ganhar um aumento");
		int idaumento = sc.nextInt();
		
		Funcionario func = list.stream().filter(x -> x.getId() == idaumento).findFirst().orElse(null);
		
		if(func == null) {
			System.out.println("Este id nao existe");
			
		}else {
			System.out.print("Insira a porcentagem:");
			double porcentagem = sc.nextDouble();
			
			
		}
		sc.close();
	}

}
