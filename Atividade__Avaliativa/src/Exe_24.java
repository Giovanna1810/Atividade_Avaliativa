
import java.util.Scanner;

public class Exe_24 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica de um carro: ");
		double custo_fabrica = scanner.nextDouble();
		
		double custo_novo = (custo_fabrica * 0.28) + (custo_fabrica * 0.45) + custo_fabrica;
		
		System.out.println("O custo final é: " + custo_novo);

	}
}
