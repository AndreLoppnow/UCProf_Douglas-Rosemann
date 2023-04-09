package calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			Operacao adicao = new Adicao();
			Operacao subtracao = new Subtracao();
			Operacao multiplicacao = new Multiplicacao();
			Operacao divisao = new Divisao();

			System.out.println("Escolha uma operação:");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");

			int escolha = scanner.nextInt();

			System.out.println("Digite o primeiro valor:");
			float a = scanner.nextFloat();

			System.out.println("Digite o segundo valor:");
			float b = scanner.nextFloat();

			float resultado = 0;

			switch (escolha) {
			    case 1:
			        resultado = adicao.calcular(a, b);
			        break;
			    case 2:
			        resultado = subtracao.calcular(a, b);
			        break;
			    case 3:
			        resultado = multiplicacao.calcular(a, b);
			        break;
			    case 4:
			        resultado = divisao.calcular(a, b);
			        break;
			    default:
			        System.out.println("Escolha inválida");
			        System.exit(0);
			}

			Exibicao.exibirResultado(resultado);
		}
		
	}
}	
